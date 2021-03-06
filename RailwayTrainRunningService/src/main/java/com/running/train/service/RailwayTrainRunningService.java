package com.running.train.service;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.running.train.delegate.RailwayTrainRunningDelegate;
import com.running.train.entities.RunningTrainStatus;
import com.running.train.entities.Trip;
import com.running.train.model.Route;
import com.running.train.model.Status;
import com.running.train.model.Train;
import com.running.train.model.TrainScheduler;
import com.running.train.repository.RailwayTrainRunningRepository;
import com.running.train.repository.RailwayTrainTripRepository;
import com.status.running.train.model.TrainUpdateStatus;

/**
 * This is the class that schedules the train and starts the journey
 * 
 * @author RAJASEKAR PV
 *
 */
@Service
public class RailwayTrainRunningService {

	Logger logger = LoggerFactory.getLogger(RailwayTrainRunningService.class);

	private RailwayTrainRunningRepository railwayTrainRunningRepository;

	private RailwayTrainRunningDelegate railwayTrainRunningDelegate;

	@Autowired
	private RailwayTrainTripRepository railwayTrainTripRepository;

	public RailwayTrainRunningService(RailwayTrainRunningRepository railwayTrainRunningRepository,
			RailwayTrainRunningDelegate railwayTrainRunningDelegate) {
		this.railwayTrainRunningRepository = railwayTrainRunningRepository;
		this.railwayTrainRunningDelegate = railwayTrainRunningDelegate;
	}

	public List<RunningTrainStatus> scheduleTrain(TrainScheduler schedular) {
		List<Route> fetchedRoute = railwayTrainRunningDelegate.getListOfRoutes(schedular.getRouteId());
		Train scheduledTrain = railwayTrainRunningDelegate.getTrainById(Long.valueOf(schedular.getTrainNumber()));
		// Insert a record into the trip table
		Trip startedJourney = railwayTrainTripRepository.save(getReadyForTrip(scheduledTrain, fetchedRoute.get(0)));
		logger.info("Started Journey -> {}", startedJourney.getId());
		List<RunningTrainStatus> preparedRouteForTrain = prepareRouteForScheduledTrain(fetchedRoute, scheduledTrain,
				schedular, startedJourney);
		return railwayTrainRunningRepository.saveAll(preparedRouteForTrain);
	}

	public void updateTrainStatus(TrainUpdateStatus trainUpdate) {
		railwayTrainRunningRepository.updateTrainRunningStatus(trainUpdate.getArrivedTime(),
				trainUpdate.getDepartureTime(), trainUpdate.getStationName());
	}

	private List<RunningTrainStatus> prepareRouteForScheduledTrain(List<Route> routeList, Train train,
			TrainScheduler trainScheduler, Trip trip) {
		List<RunningTrainStatus> preparedRoute = new ArrayList<>();
		routeList.stream().forEach(station -> {
			RunningTrainStatus runningTrainStatus = new RunningTrainStatus();
			runningTrainStatus.setStationName(station.getStationName());
			runningTrainStatus.setTrainId(train.getId());
			runningTrainStatus.setTripId(trip.getId());
			preparedRoute.add(runningTrainStatus);
		});
		preparedRoute.get(0).setDepartureTime(trainScheduler.getDepartureTime());
		return preparedRoute;
	}

	private Trip getReadyForTrip(Train train, Route route) {
		Trip trip = new Trip();
		trip.setDestinationStation(train.getDestinationStationCode());
		trip.setSourceStation(train.getSourceStationCode());
		trip.setJourneyDate(new Date(Instant.now().getEpochSecond()));
		trip.setTripStatus(Status.STARTED);
		trip.setRouteId(route.getRouteId());
		return trip;
	}
}

package com.train.routing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.train.routing.contract.APIRoutingService;
import com.train.routing.entities.Route;
import com.train.routing.repository.TrainRoutingRepository;
/**
 * The Service layer that does all the business processing logic by using the
 * hold of Repository object reference.
 * 
 * @author PVR
 * 
 * @since 19 / 07 / 2020.
 */
@Service
public class TrainRoutingService implements APIRoutingService {

	private TrainRoutingRepository trainRoutingRepository;

	public TrainRoutingService(TrainRoutingRepository trainRoutingRepository) {
		this.trainRoutingRepository = trainRoutingRepository;
	}

	public List<Route> getAllTrainRoutes() {
		return trainRoutingRepository.findAll();
	}

	public List<String> getStationListByRouteId(int id) {
		return  trainRoutingRepository.getStationListByRouteId(id);
	}

	public List<Route> getRoute(int id) {
		return  trainRoutingRepository.getRouteById(id);
	}

	public List<Route> newRoute(List<Route> route) {		
		return trainRoutingRepository.saveAll(route);
	}

	public void deleteRoute(int id) {
		trainRoutingRepository.deleteByRouteId(id);
	}
}
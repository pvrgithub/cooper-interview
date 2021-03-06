package com.running.train.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.running.train.entities.RunningTrainStatus;

@Repository
public interface RailwayTrainRunningRepository extends JpaRepository<RunningTrainStatus, Integer> {
	
	@Query(value = "UPDATE TRAIN_RUNNING_STATUS SET ARRIVAL_TIME = ?1, set DEPARTURE_TIME= ?2 WHERE STATION_NAME = ?3", nativeQuery = true)
	public void updateTrainRunningStatus(Timestamp arrivalTime, Timestamp departureTime, String stationName);
	
}
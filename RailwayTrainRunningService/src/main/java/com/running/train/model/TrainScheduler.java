package com.running.train.model;

import java.sql.Timestamp;

public class TrainScheduler {
	
	private int trainNumber;
	
	private int routeId;
	
	private Timestamp departureTime;

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public Timestamp getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "TrainScheduler [trainNumber=" + trainNumber + ", routeId=" + routeId + ", departureTime="
				+ departureTime + "]";
	}
}

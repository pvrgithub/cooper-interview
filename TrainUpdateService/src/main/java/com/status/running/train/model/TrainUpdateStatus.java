package com.status.running.train.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class TrainUpdateStatus implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int trainNumber;
	private int routeNumber;
	private String stationName;
	private Timestamp arrivedTime;
	private Timestamp departureTime;
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public int getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	public Timestamp getArrivedTime() {
		return arrivedTime;
	}
	public void setArrivedTime(Timestamp arrivedTime) {
		this.arrivedTime = arrivedTime;
	}
	public Timestamp getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
}
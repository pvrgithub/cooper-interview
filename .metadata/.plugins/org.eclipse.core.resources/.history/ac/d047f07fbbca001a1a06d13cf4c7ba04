package com.status.running.train.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RunningTrainStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTING_SEQUENCE")
	private int id;

	@Column(name = "TRIP_ID")
	private int tripId;

	@Column(name = "TRAIN_ID")
	private int trainId;

	@Column(name = "STATION_NAME")
	private String stationName;

	@Column(name = "ARRVIAL_TIME")
	private Timestamp arrivedTime;

	@Column(name = "DEPARTURE_TIME")
	private Timestamp departureTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
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

	@Override
	public String toString() {
		return "RunningTrainStatus [id=" + id + ", tripId=" + tripId + ", trainId=" + trainId + ", stationName="
				+ stationName + ", arrivedTime=" + arrivedTime + ", departureTime=" + departureTime + "]";
	}
}

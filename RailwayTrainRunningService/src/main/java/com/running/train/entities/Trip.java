package com.running.train.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.running.train.model.Status;

@Entity
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTING_SEQUENCE")
	@Column(name = "TRIP_ID")
	private int id;
	
	@Column(name = "JOURNEY_DATE")
	private Date journeyDate;
	
	@Column(name = "TRAIN_ID")
	private int trainId;

	@Column(name = "ROUTE_ID")
	private int routeId;
	
	@Column(name = "SOURCE_STATION")
	private String sourceStation;
	
	@Column(name = "DESTINATION_STATION")
	private String destinationStation;
	
	@Column(name = "TRIP_STATUS")
	private Enum<Status> tripStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Enum<Status> getTripStatus() {
		return tripStatus;
	}

	public void setTripStatus(Enum<Status> tripStatus) {
		this.tripStatus = tripStatus;
	}	
}

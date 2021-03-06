package com.train.routing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "STATION")
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "STATION_CODE", length = 3)
	private String stationCode;

	@Column(name = "STATION_MASTER")
	private String stationMaster;

	@Column(name = "STATION_PHONE_NUMBER", length = 10)
	private int stationContact;

	@Column(name = "NUMBER_OF_PLATFORMS")
	private int numberOfPlatforms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationMaster() {
		return stationMaster;
	}

	public void setStationMaster(String stationMaster) {
		this.stationMaster = stationMaster;
	}

	public int getStationContact() {
		return stationContact;
	}

	public void setStationContact(int stationContact) {
		this.stationContact = stationContact;
	}

	public int getNumberOfPlatforms() {
		return numberOfPlatforms;
	}

	public void setNumberOfPlatforms(int numberOfPlatforms) {
		this.numberOfPlatforms = numberOfPlatforms;
	}

	@Override
	public String toString() {
		return "Station [id=" + id + ", stationCode=" + stationCode + ", stationMaster=" + stationMaster
				+ ", stationContact=" + stationContact + ", numberOfPlatforms=" + numberOfPlatforms + "]";
	}
}

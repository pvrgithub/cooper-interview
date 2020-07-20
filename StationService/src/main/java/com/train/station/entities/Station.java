package com.train.station.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTING_SEQUENCE")
	private Long id;

	@Column(name = "STATION_NAME", length = 3)
	private String stationCode;

	@Column(name = "STATION_CONTACT", length = 10)
	private int stationContact;

	@Column(name = "NUMBER_OF_PLATFORMS")
	private int numberOfPlatforms;
	
	@CreationTimestamp
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@UpdateTimestamp
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	public Long getId() {
		return id;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
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
		return "Station [id=" + id + ", stationCode=" + stationCode + ", stationContact=" + stationContact
				+ ", numberOfPlatforms=" + numberOfPlatforms + "]";
	}
}
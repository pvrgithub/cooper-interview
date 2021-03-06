package com.running.train.model;

import java.util.Date;

public class Train {
	private Long id;

	private String name;

	private int numberOfCoaches;

	private String sourceStationCode;

	private String destinationStationCode;

	private Date createDate;

	private Date lastUpdatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfCoaches() {
		return numberOfCoaches;
	}

	public void setNumberOfCoaches(int numberOfCoaches) {
		this.numberOfCoaches = numberOfCoaches;
	}

	public String getSourceStationCode() {
		return sourceStationCode;
	}

	public void setSourceStationCode(String sourceStationCode) {
		this.sourceStationCode = sourceStationCode;
	}

	public String getDestinationStationCode() {
		return destinationStationCode;
	}

	public void setDestinationStationCode(String destinationStationCode) {
		this.destinationStationCode = destinationStationCode;
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

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", numberOfCoaches=" + numberOfCoaches + ", sourceStationCode="
				+ sourceStationCode + ", destinationStationCode=" + destinationStationCode + ", createDate="
				+ createDate + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

}
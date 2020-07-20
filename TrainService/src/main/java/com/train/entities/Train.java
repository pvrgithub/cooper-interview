package com.train.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTING_SEQUENCE")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "NUMBER_OF_COACHES", length = 10)
	private int numberOfCoaches;

	@Column(name = "SOURCE_STN_CODE")
	private String sourceStationCode;

	@Column(name = "DEST_STN_CODE")
	private String destinationStationCode;

	@CreationTimestamp
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@UpdateTimestamp
	@Column(name = "LAST_UPDATED_DATE")
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
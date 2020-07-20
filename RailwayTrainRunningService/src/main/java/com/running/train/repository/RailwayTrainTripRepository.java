package com.running.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.running.train.entities.Trip;

@Repository
public interface RailwayTrainTripRepository extends JpaRepository<Trip, Integer> {
	
}

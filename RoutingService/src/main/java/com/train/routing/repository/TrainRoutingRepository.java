package com.train.routing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.train.routing.entities.Route;

@Repository
public interface TrainRoutingRepository extends JpaRepository<Route, Integer> 
{	 
	@Query(value = "select station_name from route where route_id = ?1 order by seq_number", nativeQuery = true)
	List<String> getStationListByRouteId(int id);
	
	@Query(value = "select * from route where route_id = ?1 order by seq_number", nativeQuery = true)
	List<Route> getRouteById(int id);
	
	@Query(value = "delete from route where route_id = ?1", nativeQuery = true)
	void deleteByRouteId(int id);
}

package com.train.routing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.routing.entities.Route;
import com.train.routing.service.TrainRoutingService;

@RestController("/train")
public class TrainRoutingController {

	private TrainRoutingService routingService;

	@Autowired
	public TrainRoutingController(TrainRoutingService routingService) {
		this.routingService = routingService;
	}
	
	@GetMapping(value = "routes")
	public List<Route> getAllTrainRoutes() {
		return routingService.getAllTrainRoutes();
	}

	@GetMapping(value = "route/{id}/stations")	
	public List<String> getStationListByRouteId(@PathVariable int id) {
		return routingService.getStationListByRouteId(id);
	}

	@GetMapping(value = "route/{routeId}")
	public List<Route> getRoute(@PathVariable int routeId) {
		return routingService.getRoute(routeId);
	}

	@PostMapping(value = "route/newroute")
	public List<Route> newRoute(@RequestBody List<Route> route) {
		return routingService.newRoute(route);
	}

	@DeleteMapping(value = "route/{id}")
	public void deleteRoute(@PathVariable int id) {
		routingService.deleteRoute(id);
	}
}
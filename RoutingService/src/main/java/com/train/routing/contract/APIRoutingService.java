package com.train.routing.contract;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.routing.entities.Route;

/**
 * The sole purpose of this interface is to expose the 
 * permissible API's to the external world.
 * 
 * @author PVR
 * 
 * @since 19 / 07 / 2020
 *
 */
public interface APIRoutingService {

	@GetMapping(value = "/route/{id}/stations")
	public List<String> getStationListByRouteId(@PathVariable int id);

	@GetMapping(value = "/route/{routeId}")
	public List<Route> getRoute(@PathVariable int routeId);
}

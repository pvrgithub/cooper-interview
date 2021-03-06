package com.running.train.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.running.train.model.Route;
import com.running.train.model.Train;
import com.running.train.proxy.RoutingServiceProxy;
import com.running.train.proxy.TrainServiceProxy;

@Component
public class RailwayTrainRunningDelegate {
	
	@Autowired
	private RoutingServiceProxy routingServiceProxy;
	
	@Autowired
	private TrainServiceProxy trainServiceProxy;

	public List<Route> getListOfRoutes(int routeId) {
		return routingServiceProxy.getRoute(routeId);
	}	
	
	public Train getTrainById(@PathVariable Long id) {
		return trainServiceProxy.getTrainById(id);
	}

}

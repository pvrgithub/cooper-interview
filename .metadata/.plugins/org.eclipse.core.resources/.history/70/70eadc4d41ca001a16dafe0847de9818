package com.status.running.train;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.train.routing.controller.TrainRoutingController;
import com.train.routing.entities.Route;
import com.train.routing.service.TrainRoutingService;

@RunWith(MockitoJUnitRunner.class)
class TrainRoutingServiceApplicationTests {
	
	private static TrainRoutingService routingService = Mockito.mock(TrainRoutingService.class);
	private static TrainRoutingController routingController = new TrainRoutingController(routingService);


	@Test
	public void testGetAllTrainRoutes() {
		List<Route> route = new ArrayList<>();
		Route route1 = new Route();
		route1.setRouteId(100);
		route1.setSeqNumber(1);
		route1.setStationName("CHN");
		route.add(route1);
		when(routingService.getAllTrainRoutes()).thenReturn(route);
		List<Route> receivedRoutes = routingController.getAllTrainRoutes();
		Assert.assertTrue(receivedRoutes.get(0).getStationName().equals("CHN"));
		Assert.assertTrue(receivedRoutes.get(0).getSeqNumber() == 1);
		Assert.assertTrue(receivedRoutes.get(0).getRouteId() == 100);
	}
	
	
	@Test
	public void testGetStationListByRouteId() {	
		when(routingService.getStationListByRouteId(100)).thenReturn(Stream.of("CHN").collect(Collectors.toList()));
		List<String> stations = routingController.getStationListByRouteId(100);
		Assert.assertTrue(stations.get(0).equals("CHN"));		
	}
	
	@Test
	public void testGetRouteById() {
		List<Route> route = new ArrayList<>();
		Route route1 = new Route();
		route1.setRouteId(100);
		route1.setSeqNumber(1);
		route1.setStationName("CHN");
		Route route2 = new Route();
		route2.setRouteId(100);
		route2.setSeqNumber(2);
		route2.setStationName("DGL");
		route.add(route1);
		route.add(route2);
		when(routingService.getRoute(100)).thenReturn(route);
		List<Route> routes = routingController.getRoute(100);
		Assert.assertTrue(routes.get(0).getRouteId() == 100);
		Assert.assertTrue(routes.get(0).getStationName().equals("CHN"));
		Assert.assertTrue(routes.get(1).getRouteId() == 100);
		Assert.assertTrue(routes.get(1).getStationName().equals("DGL"));
		Assert.assertTrue(routes.get(0).getSeqNumber() == 1);
		Assert.assertTrue(routes.get(1).getSeqNumber() == 2);
	}

}

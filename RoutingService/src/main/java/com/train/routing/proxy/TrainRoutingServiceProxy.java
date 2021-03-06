package com.train.routing.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.routing.entities.Route;

/**
 * @author RAJASEKAR PV
 * 
 * @since 19 / 07 / 2020
 * 
 * This Proxy feign client is used for interservice communication.
 */
@FeignClient(name = "railway-api-gateway-server")
@RibbonClient(name = "train-routing-service")
public interface TrainRoutingServiceProxy {
	
	@GetMapping(value = "/train-routing/service/route/{routeId}")
	public List<Route> getRoute(@PathVariable int routeId);
}
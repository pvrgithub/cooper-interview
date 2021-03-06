package com.running.train.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.running.train.model.Route;

/**
 * @author RAJASEKAR PV
 * 
 * @since 19 / 07 / 2020
 * 
 * This Proxy feign client is used for interservice communication.
 */
@FeignClient(name = "railway-api-gateway-server")
@RibbonClient(name = "railway-running-train-service")
public interface RoutingServiceProxy {
	
	@GetMapping(value = "/train-routing/train/route/{routeId}")
	public List<Route> getRoute(@PathVariable int routeId);	
}
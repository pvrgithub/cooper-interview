package com.running.train.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.running.train.model.Train;

@FeignClient(name = "railway-api-gateway-server")
@RibbonClient(name = "railway-running-train-service")
public interface TrainServiceProxy {
	
	@GetMapping("/train-service/train/{id}")
	public Train getTrainById(@PathVariable Long id);

}

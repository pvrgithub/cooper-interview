package com.train.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "train-routing-service")
@EnableFeignClients(value = "com.train.routing")
public class TrainRoutingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainRoutingServiceApplication.class, args);
	}
}

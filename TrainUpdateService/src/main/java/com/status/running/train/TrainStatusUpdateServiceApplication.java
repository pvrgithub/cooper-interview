package com.status.running.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "train-running-status-update-service")
public class TrainStatusUpdateServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrainStatusUpdateServiceApplication.class, args);
	}
}
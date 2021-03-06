package com.server.railway.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RailwayNamingServer {

	public static void main(String[] args) {
		SpringApplication.run(RailwayNamingServer.class, args);
	}

}

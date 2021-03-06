package com.running.train.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.running.train.entities.RunningTrainStatus;
import com.running.train.model.TrainScheduler;
import com.running.train.service.RailwayTrainRunningService;

@RestController("/train")
public class RailwayTrainRunningController {
	
	private RailwayTrainRunningService railwayTrainRunningService;
	
	public RailwayTrainRunningController(RailwayTrainRunningService railwayTrainRunningService) {
		this.railwayTrainRunningService = railwayTrainRunningService;
	}
	
	@PostMapping("schedule")
	public List<RunningTrainStatus> scheduleTrain(@RequestBody TrainScheduler schedular) {
		return railwayTrainRunningService.scheduleTrain(schedular);
	}

}

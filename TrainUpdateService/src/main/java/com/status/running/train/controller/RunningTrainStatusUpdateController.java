package com.status.running.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.status.running.train.model.TrainUpdateStatus;
import com.status.running.train.service.RunningTrainStatusUpdateService;

@RestController
public class RunningTrainStatusUpdateController {
	
	private RunningTrainStatusUpdateService runningTrainStatusUpdateService;
	
	@Autowired
	public RunningTrainStatusUpdateController(RunningTrainStatusUpdateService runningTrainStatusUpdateService) {
		this.runningTrainStatusUpdateService = runningTrainStatusUpdateService;
	}

	@PostMapping("/train/update")
	public String updateTrainStatus(@RequestBody TrainUpdateStatus trainUpdateList) {
		return runningTrainStatusUpdateService.postTrainStatus(trainUpdateList);
	}
}
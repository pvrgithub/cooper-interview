package com.train.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.entities.Train;
import com.train.exception.BadRequestException;
import com.train.service.TrainService;

@RestController
public class TrainController {
	
	private TrainService trainService;
	
	@Autowired
	public TrainController(TrainService trainService) {
		this.trainService = trainService;
	}

	@GetMapping("/train/{id}")
	public Train getTrainById(@PathVariable Long id) {
		if (id == 0 || id < 0) {
			throw new BadRequestException("Invalid Train Number");
		}
		return trainService.getTrainById(id);
	}

	
	@PostMapping("/train/newtrain")
	public List<Train> addTrain(@RequestBody List<Train> stations) {
		return trainService.addTrain(stations);
	}
}
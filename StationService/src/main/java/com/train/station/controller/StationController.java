package com.train.station.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.station.entities.Station;
import com.train.station.exception.BadRequestException;
import com.train.station.service.StationService;

@RestController
public class StationController {
	
	private StationService stationService;
	
	@Autowired
	public StationController(StationService stationService) {
		this.stationService = stationService;
	}

	@GetMapping("/station/{id}")
	public Station getStationById(@PathVariable Long id) {
		if (id == 0 || id < 0) {
			throw new BadRequestException("Invalid Station Id");
		}
		return stationService.getStationById(id);
	}

	
	@PostMapping("/station/newstation")
	public List<Station> adddStation(@RequestBody List<Station> stations) {
		return stationService.addStation(stations);
	}
}
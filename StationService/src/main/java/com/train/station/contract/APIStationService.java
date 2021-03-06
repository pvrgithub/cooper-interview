package com.train.station.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.station.entities.Station;

/**
 * The sole purpose of this interface is to expose the 
 * permissible API's to the external world.
 * 
 * @author PVR
 * 
 * @since 19 / 07 / 2020
 *
 */
public interface APIStationService {

	@GetMapping(value = "/station/{id}")
	public Station getStationById(@PathVariable Long id);

}

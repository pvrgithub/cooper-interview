package com.train.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.entities.Train;

/**
 * The sole purpose of this interface is to expose the 
 * permissible API's to the external world.
 * 
 * @author PVR
 * 
 * @since 19 / 07 / 2020
 *
 */
public interface APITrainService {

	@GetMapping(value = "/train/{id}")
	public Train getTrainById(@PathVariable Long trainNumber);

}

package com.train.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.contract.APITrainService;
import com.train.entities.Train;
import com.train.repository.TrainRepository;
/**
 * The Service layer that does all the business processing logic by using the
 * hold of Repository object reference.
 * 
 * @author PVR
 * 
 * @since 20 / 07 / 2020.
 */
@Service
public class TrainService implements APITrainService {

	private TrainRepository trainRepository;

	public TrainService(TrainRepository trainRepository) {
		this.trainRepository = trainRepository;
	}

	public Train getTrainById(@PathVariable Long id) {
		return trainRepository.findById(id).get();
	}
	
	public List<Train> addTrain(List<Train> trains) {		
		return trainRepository.saveAll(trains);
	}
}
package com.train.station.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.station.contract.APIStationService;
import com.train.station.entities.Station;
import com.train.station.repository.SubjectRepository;
/**
 * The Service layer that does all the business processing logic by using the
 * hold of Repository object reference.
 * 
 * @author PVR
 * 
 * @since 20 / 07 / 2020.
 */
@Service
public class StationService implements APIStationService {

	private SubjectRepository subjectRepository;

	public StationService(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}

	public Station getStationById(@PathVariable Long id) {
		return subjectRepository.findById(id).get();
	}	
	
	public List<Station> addStation(List<Station> stations) {		
		return subjectRepository.saveAll(stations);
	}
}
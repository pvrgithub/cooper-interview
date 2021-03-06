package com.status.running.train;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.train.station.controller.StationController;
import com.train.station.entities.Station;
import com.train.station.exception.BadRequestException;
import com.train.station.service.StationService;

@RunWith(MockitoJUnitRunner.class)
class StationServiceTests {
	
	private  StationService subjectService = Mockito.mock(StationService.class);
	private  StationController subjectController = new StationController(subjectService);


	@Test
	public void testGetStationById() {
		Station station = new Station();
		station.setId(100L);
		station.setNumberOfPlatforms(5);
		station.setStationCode("MDU");
		when(subjectService.getStationById(100L)).thenReturn(station);
		Station receivedStation = subjectController.getStationById(100L);
		Assert.assertTrue(receivedStation.getStationCode().equals("MDU"));
		Assert.assertTrue(receivedStation.getId() == (100));
		Assert.assertTrue(receivedStation.getNumberOfPlatforms() == (5));
	}
	
	
	@org.junit.Test(expected = BadRequestException.class) 		
	public void testInvalidStationThrowsException() {	
		subjectController.getStationById(-1L);
	}
	
}

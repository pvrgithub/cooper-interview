package com.running.train.status.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.running.train.service.RailwayTrainRunningService;
import com.status.running.train.model.TrainUpdateStatus;


/**
 * This receiver picks the journey updates from the queue and updates the Train Running Table
 * 
 * @author RAJASEKAR PV
 * 
 * @since 21 / 07 / 2020
 */
@Service
public class TrainRunningStatusReceiver {
	
	@Autowired
	private RailwayTrainRunningService railwayTrainRunningService;
	
	@RabbitListener(queues = "${train-running-service.rabbitmq.queueName}")
	public void receiveTrainUpdateStatus(final TrainUpdateStatus trainStatusUpdate) {
		railwayTrainRunningService.updateTrainStatus(trainStatusUpdate);
	}
}

package com.status.running.train.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.status.running.train.config.MQProperties;
import com.status.running.train.model.TrainUpdateStatus;

/**
 * The Service layer that does all the business processing logic by using the
 * hold of Repository object reference.
 * 
 * @author PVR
 * 
 * @since 20 / 07 / 2020.
 */
@Service
public class RunningTrainStatusUpdateService {
	
	@Autowired
	private RabbitTemplate rabbitMQTemplate;
	
	@Autowired
	private MQProperties mqProperties;

	public String postTrainStatus(TrainUpdateStatus updateList) {
		rabbitMQTemplate.convertAndSend(mqProperties.getExchangeName(), mqProperties.getRoutingKey(), updateList);
		return "Status Posted Successfully";
	}
}
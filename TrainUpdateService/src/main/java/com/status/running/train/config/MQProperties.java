package com.status.running.train.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Read the properties from the Config server
 * 
 * @author RAJASEKAR PV
 * 
 * @since 20 / 07 / 2020
 */
@Configuration
@ConfigurationProperties(prefix = "train-update-service.rabbitmq")
public class MQProperties {
	
    private String queueName;
    
    private String exchangeName;
	
    private String routingKey;

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }
}

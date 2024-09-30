package com.user.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = AppConstants.locationTopicName,groupId = AppConstants.groupId)
    public void updateLocation(String location){
        logger.info("Location consumed : {}",location);
    }
}

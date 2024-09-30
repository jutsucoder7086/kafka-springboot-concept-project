package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    private KafkaTemplate<String, String> kafkaTemplate;


    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public Boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.locationTopicName,location);
        this.logger.info("Location Produced");
        return true;
    }
}

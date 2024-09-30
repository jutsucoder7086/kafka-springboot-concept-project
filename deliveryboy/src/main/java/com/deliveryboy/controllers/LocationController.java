package com.deliveryboy.controllers;

import com.deliveryboy.service.KafkaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("location")
public class LocationController {

    private KafkaService kafkaService;

    public LocationController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @GetMapping("/update")
    public ResponseEntity<Map<String,String>> updateLocation(){
        this.kafkaService.updateLocation("("+this.generateRandomNumber()+","+this.generateRandomNumber()+")");
        return ResponseEntity.ok(Map.of("message: ","Location Updated"));
    }

    private long generateRandomNumber(){
        return Math.round(Math.random()*100);
    }
}

package com.deliveryboy.controller;

import com.deliveryboy.Services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @RequestMapping("/update")
    public ResponseEntity<?> updateLocation() {
        kafkaService.updateLocation("("+ Math.round(Math.random() *100)+", "+Math.round(Math.random() *100)+")");
        return ResponseEntity.ok("Location updated successfully!");
    }

}

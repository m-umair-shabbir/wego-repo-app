package com.umair.fortuneservices.rest;

import com.umair.fortuneservices.model.HealthCheck;
import com.umair.fortuneservices.model.Quotes;
import com.umair.fortuneservices.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1")
public class QuotesController {

    @Autowired
    QuotesService quotesService;

    @GetMapping("/fortune")
    public ResponseEntity<Quotes> getQuote() {
        Random r = new Random();
        int low = 1;
        int high = 10;
        int result = r.nextInt(high-low) + low;
        Quotes object = quotesService.findById((long) result);
        if (object != null) {
            return new ResponseEntity<>(object, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/healthcheck")
    public ResponseEntity<HealthCheck> getHealthStatus() {
        HealthCheck object = new HealthCheck(true, "All is okay!");
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
}

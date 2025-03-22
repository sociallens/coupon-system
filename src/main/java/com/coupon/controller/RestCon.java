package com.coupon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCon {

    @GetMapping("/webhook")
    public ResponseEntity<String> verifyWebhook(
            @RequestParam(name = "hub_mode") String mode,
            @RequestParam(name = "hub_challenge") String challenge,
            @RequestParam(name = "hub_verify_token") String token) {

        System.out.println("mode: " + mode + ", challenge: " + challenge + ", token: " + token);
        String VERIFY_TOKEN = "your_verify_token"; // Replace with your verify token

        
            return ResponseEntity.ok(challenge); // Respond with the challenge token
        
    }
}

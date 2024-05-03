package com.example.reactordemoservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@Slf4j
public class BlockController {
    @GetMapping("/block")
    public String getInstant() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            log.error("Error in sleep", e);
        }
        log.info("New request: {}", Instant.now());
        return Instant.now().toString();
    }
}

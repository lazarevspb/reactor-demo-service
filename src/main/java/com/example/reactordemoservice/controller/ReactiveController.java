package com.example.reactordemoservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@Slf4j
public class ReactiveController {
    @GetMapping("/reactive")
    public Mono<String> getInstant() {
        log.info("New request: {}", Instant.now());
        return Mono.just(Instant.now().toString());
    }
}

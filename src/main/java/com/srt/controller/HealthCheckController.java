package com.srt.controller;

import com.srt.model.StatusDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@CrossOrigin
@Slf4j
public class HealthCheckController {

    @GetMapping("/live")
    public StatusDTO livenessCheck() {
        log.info("Liveness check requested");
        return new StatusDTO("UP");
    }
}

package com.madaclinicspa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MadaApplication {

    static final Logger logger = LoggerFactory.getLogger(MadaApplication.class);
    public static void main(String[] args) {
        logger.info("Starting The MADA Application");
        SpringApplication.run(MadaApplication.class, args);
    }
}
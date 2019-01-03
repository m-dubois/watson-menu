package org.matt.watson.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatsonApiApplication {
    private static final Logger LOG = LoggerFactory.getLogger(WatsonApiApplication.class);
    public static void main(String[] args) {
		SpringApplication.run(WatsonApiApplication.class, args);
	}
}

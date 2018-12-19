package org.matt.watson.backend;

import org.matt.watson.backend.controller.BackendController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class WatsonApiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static void main(String[] args) {
		SpringApplication.run(WatsonApiApplication.class, args);
	}

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String allowedOrigin = "http://localhost:8081";

                LOG.info("Adding CORS allowed origins: {}", allowedOrigin);
                registry.addMapping("/api").allowedOrigins(allowedOrigin);
            }
        };
    }
}

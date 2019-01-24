package org.matt.watson.backend.infra.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WatsonApiConfig implements WebMvcConfigurer {

    private static final Logger LOG = LoggerFactory.getLogger(WatsonApiConfig.class);

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String allowedOrigin = "http://localhost:8081";

        LOG.info("Adding CORS allowed origins: {}", allowedOrigin);
        registry.addMapping("/api").allowedOrigins(allowedOrigin);
    }

}

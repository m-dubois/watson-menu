package org.matt.watson.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WatsonApiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WatsonApiApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(WatsonApiApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            if (name.equals("h2Bean") || name.equals("postgresBean")) {
                System.out.println(name + " = " + applicationContext.getBean(name));
                LOG.info(name + " = " + applicationContext.getBean(name));
            }
        }

        for (String profile : applicationContext.getEnvironment().getActiveProfiles()) {
            System.out.println(profile);
            LOG.info("profile: "+ profile);
        }

    }

    @Profile("h2")
    @Bean
    public String h2Bean() {
        return "h2";
    }

    @Profile("postgres")
    @Bean
    public String postgresBean() {
        return "postgres";
    }
}

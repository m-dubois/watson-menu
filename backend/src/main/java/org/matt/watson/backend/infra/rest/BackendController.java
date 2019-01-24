package org.matt.watson.backend.infra.rest;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
@Api(value="/api",description="Test API",produces ="application/json")
public class BackendController {

    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello(
            @RequestParam(value = "delay", required = false) Integer delay) {

        LOG.info("GET called on /hello resource with delay {}", delay);
        if (delay != null) {
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {}
        }
        return HELLO_TEXT;
    }

}

package org.matt.watson.backend;

import org.junit.Before;
import org.junit.Test;
import org.matt.watson.backend.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationIntegrationTest {

    private static final Long ID = 1l;

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private StarterService starterService;

    @Before
    public void setup() {
        /*
        given(this.starterService.getStarter(ID))
                .willReturn(new Starter("Carottes"));
                */
    }

    @Test
    public void test() {
        /*
        ResponseEntity<String> response = this.restTemplate
                .getForEntity("/{username}/vehicle", String.class, "mickey");
        assertThat(response.getBody()).contains("Honda");
        */
    }

}

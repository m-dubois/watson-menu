package org.matt.watson.backend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.infra.repository.StarterRepositoryImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(MockitoJUnitRunner.class)
public class StarterControllerTest {

    private MockMvc mvc;

    @Mock
    private StarterRepositoryImpl starterRepository;

    @InjectMocks
    private StarterController starterController;

    // This object will be magically initialized by the initFields method below.
    private JacksonTester<Starter> jsonStarter;

    @Before
    public void setUp() throws Exception {
        // We would need this line if we would not use MockitoJUnitRunner
        // MockitoAnnotations.initMocks(this);
        // Initializes the JacksonTester
        JacksonTester.initFields(this, new ObjectMapper());
        // MockMvc standalone approach
        mvc = MockMvcBuilders.standaloneSetup(starterController)
                .setControllerAdvice(new RestExceptionHandler())
                .addFilters(new StarterFilter())
                .build();
    }

    @Test
    public void canRetrieveByIdWhenExists() throws Exception {
        // given
        given(starterRepository.findById(1L)).willReturn(Optional.of(new Starter("Carottes")));

        // when
        MockHttpServletResponse response = mvc.perform(
                    get("/starters/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(
                jsonStarter.write(new Starter("Carottes")).getJson()
        );
    }

    @Test
    public void getStarterById() {
    }

    @Test
    public void getStarterByName() {
    }

    @Test
    public void addNewStarter() {
    }
}
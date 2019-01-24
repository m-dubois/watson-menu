package org.matt.watson.backend.infra.rest;

import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;
import org.matt.watson.backend.infra.rest.mappers.StarterResourceMapper;
import org.matt.watson.backend.infra.rest.resources.StarterResource;
import org.matt.watson.backend.domain.service.StarterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@RequestMapping("/starters")
public class StarterController {

    private static final Logger LOG = LoggerFactory.getLogger(StarterController.class);

    private final StarterService starterService;

    @Autowired
    public StarterController(StarterService starterService) {
        this.starterService = starterService;
    }

    @GetMapping("/{id}")
    public Starter getStarterById(@PathVariable Long id) {
        return starterService.getStarter(id).orElseThrow(NonExistingStarterException::new);
    }

    @GetMapping
    public Optional<Starter> getStarterByName(@RequestParam("name") String name) {
        //return starterRepository.getStarter(name);
        throw new NonExistingStarterException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewStarter(@RequestBody StarterResource starterResource) {
        LOG.info("addNewStarter({})", starterResource);

        Starter starter = StarterResourceMapper.INSTANCE.mapStarterResourceToStarter(starterResource);
        this.starterService.createStarter(starter);

    }


}

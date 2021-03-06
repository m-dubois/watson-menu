package org.matt.watson.backend.infra.rest;

import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.domain.service.MealService;
import org.matt.watson.backend.exceptions.NonExistingStarterException;
import org.matt.watson.backend.exceptions.NotImplementedException;
import org.matt.watson.backend.infra.rest.mappers.StarterResourceMapper;
import org.matt.watson.backend.infra.rest.resources.StarterResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@RequestMapping("${api.v1}/starters")
public class StarterController {

    private static final Logger LOG = LoggerFactory.getLogger(StarterController.class);

    private final MealService mealService;

    @Autowired
    public StarterController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/{id}")
    public Starter getStarterById(@PathVariable Long id) {
        return mealService.getStarter(id).orElseThrow(NonExistingStarterException::new);
    }

    @GetMapping
    public Optional<Starter> getStarterByName(@RequestParam("name") String name) {
        throw new NotImplementedException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewStarter(@RequestBody StarterResource starterResource) {
        LOG.info("addNewStarter({})", starterResource);

        Starter starter = StarterResourceMapper.INSTANCE.mapStarterResourceToStarter(starterResource);
        this.mealService.createStarter(starter);

    }


}

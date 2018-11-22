package org.matt.watson.backend.controller;

import org.matt.watson.backend.domain.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;
import org.matt.watson.backend.repository.StarterRepository;
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

    private final StarterRepository starterRepository;

    @Autowired
    public StarterController(StarterRepository superHeroRepository) {
        this.starterRepository = superHeroRepository;
    }

    @GetMapping("/{id}")
    public Starter getStarterById(@PathVariable Long id) {
        return starterRepository.findById(id).orElseThrow(NonExistingStarterException::new);
    }

    @GetMapping
    public Optional<Starter> getStarterByName(@RequestParam("name") String name) {
        //return starterRepository.getStarter(name);
        throw new NonExistingStarterException();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewStarter(@RequestBody Starter starter) {
        this.starterRepository.save(starter);
    }


}

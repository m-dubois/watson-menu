package org.matt.watson.backend.domain.service;

import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;

import java.util.Optional;

public interface MealService {

    Optional<Starter> getStarter(long id) throws NonExistingStarterException;
    void createStarter(Starter starter);

}

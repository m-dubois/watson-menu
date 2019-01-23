package org.matt.watson.backend.service;

import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;

import java.util.Optional;

public interface StarterService {

    Optional<Starter> getStarter(long id) throws NonExistingStarterException;
    void createStarter(Starter starter);

}

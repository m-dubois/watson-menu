package org.matt.watson.backend.service;

import org.matt.watson.backend.domain.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;

public interface StarterService {

    Starter getStarter(long id) throws NonExistingStarterException;

}

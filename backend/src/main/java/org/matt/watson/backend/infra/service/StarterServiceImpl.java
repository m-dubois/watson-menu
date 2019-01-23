package org.matt.watson.backend.infra.service;

import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.exceptions.NonExistingStarterException;
import org.matt.watson.backend.infra.repository.StarterEntity;
import org.matt.watson.backend.infra.repository.StarterEntityMapper;
import org.matt.watson.backend.infra.repository.StarterRepositoryImpl;
import org.matt.watson.backend.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StarterServiceImpl implements StarterService {

    @Autowired
    private StarterRepositoryImpl starterRepository;

    @Override
    public Optional<Starter> getStarter(long id) throws NonExistingStarterException {
        Optional<StarterEntity> starter = starterRepository.findById(id);

        if (starter.isPresent()) {
            Starter menu = StarterEntityMapper.mapStarterEntityToStarter(starter.get());
            return Optional.of(menu);
        } else {
            return Optional.empty();
        }
    }

    public void createStarter(Starter starter) {

        StarterEntity starterEntity = StarterEntityMapper.mapStarterToStarterEntity(starter);
        starterRepository.save(starterEntity);

    }
}

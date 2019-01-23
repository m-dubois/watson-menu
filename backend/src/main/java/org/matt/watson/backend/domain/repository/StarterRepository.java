package org.matt.watson.backend.domain.repository;

import org.matt.watson.backend.infra.repository.StarterEntity;

import java.util.Date;
import java.util.Optional;

public interface StarterRepository {

    StarterEntity save(StarterEntity StarterEntity);
    Optional<StarterEntity> findById(Long id);
}
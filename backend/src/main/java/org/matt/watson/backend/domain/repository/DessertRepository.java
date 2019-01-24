package org.matt.watson.backend.domain.repository;

import org.matt.watson.backend.infra.repository.DessertEntity;

import java.util.Optional;

public interface DessertRepository {

    DessertEntity save(DessertEntity dessertEntity);
    Optional<DessertEntity> findById(Long id);
}
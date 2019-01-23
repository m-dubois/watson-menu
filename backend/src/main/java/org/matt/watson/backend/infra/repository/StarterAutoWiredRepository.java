package org.matt.watson.backend.infra.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface StarterAutoWiredRepository extends CrudRepository<StarterEntity, Long> {
    Optional<StarterEntity> findById(long id);
}

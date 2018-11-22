package org.matt.watson.backend.repository;

import org.matt.watson.backend.domain.Starter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarterRepository extends CrudRepository<Starter, Long> {
}
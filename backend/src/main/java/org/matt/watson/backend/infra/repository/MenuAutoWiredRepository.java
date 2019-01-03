package org.matt.watson.backend.infra.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface MenuAutoWiredRepository extends CrudRepository<MenuEntity, Long> {
    Optional<MenuEntity> findByDay(Date day);
}

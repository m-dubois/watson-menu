package org.matt.watson.backend.domain.repository;

import org.matt.watson.backend.infra.repository.MainCourseEntity;

import java.util.Optional;

public interface MainCourseRepository {

    MainCourseEntity save(MainCourseEntity mainCourseEntity);
    Optional<MainCourseEntity> findById(Long id);
}
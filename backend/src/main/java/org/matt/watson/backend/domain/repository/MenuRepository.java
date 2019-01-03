package org.matt.watson.backend.domain.repository;

import org.matt.watson.backend.infra.repository.MenuEntity;

import java.util.Date;
import java.util.Optional;

public interface MenuRepository {

    MenuEntity save(MenuEntity menuEntity);
    Optional<MenuEntity> findById(Long id);
    Optional<MenuEntity> findByDay(Date day);
}
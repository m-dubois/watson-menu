package org.matt.watson.backend.infra.repository;

import org.matt.watson.backend.domain.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public class MenuRepositoryImpl implements MenuRepository {

    private final MenuAutoWiredRepository impl;

    @Autowired
    public MenuRepositoryImpl(final MenuAutoWiredRepository impl) {
        this.impl = impl;
    }

    @Override
    public Optional<MenuEntity> findById(Long id) {
        return impl.findById(id);
    }

    @Override
    public Optional<MenuEntity> findByDay(Date day) {
        return impl.findByDay(day);
    }

    @Override
    public MenuEntity save(MenuEntity menuEntity) {
        return impl.save(menuEntity);
    }
}
package org.matt.watson.backend.infra.repository;

import org.matt.watson.backend.domain.repository.StarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StarterRepositoryImpl implements StarterRepository {

    private final StarterAutoWiredRepository impl;

    @Autowired
    public StarterRepositoryImpl(final StarterAutoWiredRepository impl) {
        this.impl = impl;
    }

    @Override
    public Optional<StarterEntity> findById(Long id) {
        return impl.findById(id);
    }

    @Override
    public StarterEntity save(StarterEntity starterEntity) {
        return impl.save(starterEntity);
    }
}
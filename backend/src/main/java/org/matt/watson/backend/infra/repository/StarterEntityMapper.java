package org.matt.watson.backend.infra.repository;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Starter;

@Mapper
public interface StarterEntityMapper {

    StarterEntityMapper INSTANCE = Mappers.getMapper(StarterEntityMapper.class);

    StarterEntity mapStarterToStarterEntity(Starter starter);
    Starter mapStarterEntityToStarter(StarterEntity starterEntity);
}

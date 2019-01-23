package org.matt.watson.backend.infra.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.infra.rest.resources.StarterResource;

@Mapper
public interface StarterResourceMapper {

    StarterResourceMapper INSTANCE = Mappers.getMapper(StarterResourceMapper.class);

    StarterResource mapStarterToStarterResource(Starter starter);
    Starter mapStarterResourceToStarter(StarterResource starterResource);
}

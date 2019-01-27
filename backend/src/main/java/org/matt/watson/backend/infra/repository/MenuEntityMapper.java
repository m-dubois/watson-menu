package org.matt.watson.backend.infra.repository;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.domain.model.Starter;

@Mapper
public interface MenuEntityMapper {

    MenuEntityMapper INSTANCE = Mappers.getMapper(MenuEntityMapper.class);

    MenuEntity mapMenuToMenuEntity(Menu menu);

    @Mappings({
            @Mapping(target = "locale", ignore = true)
    })
    Menu mapMenuEntityToMenu(MenuEntity menuEntity);

    StarterEntity mapStarterToStarterEntity(Starter starter);

    Starter mapStarterEntityToStarter(StarterEntity starterEntity);
}

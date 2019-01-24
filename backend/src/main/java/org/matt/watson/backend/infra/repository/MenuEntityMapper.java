package org.matt.watson.backend.infra.repository;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Menu;

@Mapper
public interface MenuEntityMapper {

    MenuEntityMapper INSTANCE = Mappers.getMapper(MenuEntityMapper.class);

    @Mapping(target = "starterEntity", ignore = true)
    MenuEntity mapMenuToMenuEntity(Menu menu);

    @Mapping(target = "locale", ignore = true)
    Menu mapMenuEntityToMenu(MenuEntity menuEntity);
}

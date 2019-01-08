package org.matt.watson.backend.infra.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.infra.rest.resources.MenuResource;

@Mapper
public interface MenuResourceMapper {

    MenuResourceMapper INSTANCE = Mappers.getMapper(MenuResourceMapper.class);

    MenuResource mapMenuToMenuResource(Menu menu);
    Menu mapMenuResourceToMenu(MenuResource menuResource);
}

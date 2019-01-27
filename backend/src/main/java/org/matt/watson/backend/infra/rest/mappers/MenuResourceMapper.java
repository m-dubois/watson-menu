package org.matt.watson.backend.infra.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.domain.model.Starter;
import org.matt.watson.backend.infra.rest.resources.MenuResource;
import org.matt.watson.backend.infra.rest.resources.StarterResource;

@Mapper
public interface MenuResourceMapper {

    MenuResourceMapper INSTANCE = Mappers.getMapper(MenuResourceMapper.class);

    @Mappings({
            @Mapping(source = "starter", target = "meal.starter"),
            @Mapping(source = "mainCourse", target = "meal.mainCourse"),
            @Mapping(source = "dessert", target = "meal.dessert")
    })
    MenuResource mapMenuToMenuResource(Menu menu);

    Menu mapMenuResourceToMenu(MenuResource menuResource);

    StarterResource mapStarterToStarterResource(Starter starter);

    Starter mapStarterResourceToStarter(StarterResource StarterResource);
}

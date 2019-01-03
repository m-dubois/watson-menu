package org.matt.watson.backend.infra.rest.mappers;

import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.infra.repository.MenuEntity;
import org.matt.watson.backend.infra.rest.resources.MenuResource;

public class MenuResourceMapper {

    private MenuResourceMapper() {
    }

    public static MenuResource mapMenuToMenuResource(Menu menu){
        MenuResource menuResource = new MenuResource();
        menuResource.setId(menu.getId());
        menuResource.setDay(menu.getDay());
        menuResource.setDayOfWeek(menu.getDayOfWeek());

        return menuResource;
    }

    public static Menu mapMenuResourceToMenu(MenuResource menuResource){
        Menu menu = new Menu();
        menu.setId(menuResource.getId());
        menu.setDay(menuResource.getDay());

        return menu;
    }
}

package org.matt.watson.backend.infra.repository;

import org.matt.watson.backend.domain.model.Menu;

public class MenuEntityMapper {

    private MenuEntityMapper() {
    }

    public static MenuEntity mapMenuToMenuEntity(Menu menu){
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setId(menu.getId());
        menuEntity.setDay(menu.getDay());

        return menuEntity;
    }

    public static Menu mapMenuEntityToMenu(MenuEntity menuEntity){
        Menu menu = new Menu();
        menu.setId(menuEntity.getId());
        menu.setDay(menuEntity.getDay());

        return menu;
    }
}

package org.matt.watson.backend.infra.service;

import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.domain.repository.MenuRepository;
import org.matt.watson.backend.domain.service.MenuService;
import org.matt.watson.backend.infra.repository.MenuEntity;
import org.matt.watson.backend.infra.repository.MenuEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Optional<Menu> findByDay(Date day) {
        Optional<MenuEntity> menuByDay = menuRepository.findByDay(day);

        if (menuByDay.isPresent()) {
            Menu menu = MenuEntityMapper.mapMenuEntityToMenu(menuByDay.get());
            return Optional.of(menu);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void createMenu(Menu menu) {

        MenuEntity menuEntity = MenuEntityMapper.mapMenuToMenuEntity(menu);
        menuRepository.save(menuEntity);

    }
}

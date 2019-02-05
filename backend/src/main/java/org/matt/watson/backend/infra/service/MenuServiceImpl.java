package org.matt.watson.backend.infra.service;

import java.util.Date;
import java.util.Optional;

import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.domain.repository.MenuRepository;
import org.matt.watson.backend.domain.service.MenuService;
import org.matt.watson.backend.infra.repository.MenuEntity;
import org.matt.watson.backend.infra.repository.MenuEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    private static final Logger LOG = LoggerFactory.getLogger(MenuServiceImpl.class);

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Optional<Menu> findByDay(Date day) {
        Optional<MenuEntity> menuByDay = menuRepository.findByDay(day);

        if (menuByDay.isPresent()) {
            LOG.debug("menuByDay={}", menuByDay.get());
            Menu menu = MenuEntityMapper.INSTANCE.mapMenuEntityToMenu(menuByDay.get());
            LOG.debug("menu={}", menu);
            return Optional.of(menu);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void createMenu(Menu menu) {

        MenuEntity menuEntity = MenuEntityMapper.INSTANCE.mapMenuToMenuEntity(menu);
        menuRepository.save(menuEntity);

    }
}

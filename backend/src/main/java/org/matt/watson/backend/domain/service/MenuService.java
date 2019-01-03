package org.matt.watson.backend.domain.service;

import org.matt.watson.backend.domain.model.Menu;

import java.util.Date;
import java.util.Optional;

public interface MenuService {
    Optional<Menu> findByDay(Date day);
    void createMenu(Menu menu);
}

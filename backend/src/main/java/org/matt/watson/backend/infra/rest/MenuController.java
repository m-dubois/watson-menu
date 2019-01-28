package org.matt.watson.backend.infra.rest;

import org.matt.watson.backend.domain.model.Menu;
import org.matt.watson.backend.domain.service.MenuService;
import org.matt.watson.backend.exceptions.NonExistingMenuException;
import org.matt.watson.backend.infra.rest.mappers.MenuResourceMapper;
import org.matt.watson.backend.infra.rest.resources.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController()
@RequestMapping("${api.v1}/menus")
public class MenuController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public MenuResource getMenuByDay(@RequestParam("day") String dayString) {
        Date day;
        try {
            day = new SimpleDateFormat(Constants.DATE_PATTERN).parse(dayString);
        } catch (ParseException e) {
            String msg = "Could not parse day : " + dayString;
            LOG.error("getMenuByDay({}) : {}", dayString, msg);
            throw new IllegalArgumentException(msg);
        }

        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dateFormat.format(day);

        LOG.debug("parsed day string: {} -- parsed day: {} -- day of week: {}", dayString, day, dayOfWeek);
        Menu menu = this.menuService.findByDay(day).orElseThrow(NonExistingMenuException::new);
        LOG.debug("menu returned by menuService: {}", menu);

        MenuResource menuResource = MenuResourceMapper.INSTANCE.mapMenuToMenuResource(menu);

        LOG.info("menuResource: {}", menuResource);

        return menuResource;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewMenu(@RequestBody MenuResource menuResource) {

        LOG.info("addNewMenu({})", menuResource);

        Menu menu = MenuResourceMapper.INSTANCE.mapMenuResourceToMenu(menuResource);
        this.menuService.createMenu(menu);
    }

}

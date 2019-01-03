package org.matt.watson.backend;

import org.matt.watson.backend.domain.repository.MenuRepository;
import org.matt.watson.backend.infra.repository.MenuEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Component
@Profile({"h2"})
public class DataLoader implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(DataLoader.class);

    public static final String DATE_PARSING_PATTERN = "yyyy-MM-dd";

    MenuRepository menuRepository;

    @Autowired
    public DataLoader(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public static Date asDate(LocalDate localDate) {
        try {
            return new SimpleDateFormat(DATE_PARSING_PATTERN).parse(localDate.toString());
        } catch (ParseException e) {
            LOG.error("Problem while parsing date {}", localDate.toString());
            return new Date();
        }
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        addNewMenu("2014-02-14");
        addNewMenu("2018-12-31");
    }

    private void addNewMenu(String date) {
        MenuEntity menu = new MenuEntity();
        menu.setDay(DataLoader.asDate(LocalDate.parse(date)));
        menuRepository.save(menu);
    }
}

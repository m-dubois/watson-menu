package org.matt.watson.backend;

import org.matt.watson.backend.domain.repository.MenuRepository;
import org.matt.watson.backend.domain.repository.StarterRepository;
import org.matt.watson.backend.infra.repository.MenuEntity;
import org.matt.watson.backend.infra.repository.StarterEntity;
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
    StarterRepository starterRepository;

    @Autowired
    public DataLoader(MenuRepository menuRepository, StarterRepository starterRepository) {
        this.menuRepository = menuRepository;
        this.starterRepository = starterRepository;
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

        LOG.info("DataLoader");

        StarterEntity starterEntity = addNewStarter("Carottes râpées");

        addNewMenu("2014-02-14", starterEntity);
        addNewMenu("2018-12-31", starterEntity);

        LOG.info("{}", menuRepository.findById(1L));
    }

    private StarterEntity addNewStarter(String name) {
        StarterEntity starterEntity = new StarterEntity();

        starterEntity.setName("Carottes râpées");

        return starterRepository.save(starterEntity);
    }


    private void addNewMenu(String date, StarterEntity starterEntity) {
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setId(200L);
        menuEntity.setDay(DataLoader.asDate(LocalDate.parse(date)));

        menuEntity.setStarterEntity(starterEntity);


        LOG.info("{}", menuEntity);

        menuRepository.save(menuEntity);

    }
}

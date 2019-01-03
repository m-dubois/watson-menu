package org.matt.watson.backend.domain.model;

import org.junit.Assert;
import org.junit.Test;
import org.matt.watson.backend.infra.rest.Constants;
import org.matt.watson.backend.infra.rest.MenuController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.*;

public class MenuTest {

    private static final Logger LOG = LoggerFactory.getLogger(MenuTest.class);

    @Test
    public void getDayOfWeekFrance() {

        Locale frLocale = new Locale("fr", "FR");

        Menu menu = new Menu();
        menu.setLocale(frLocale);

        try {
            Date day = new SimpleDateFormat(Constants.DATE_PATTERN, frLocale).parse("2018-12-31");
            menu.setDay(day);
        } catch (ParseException e) {
            LOG.error("Problem with date parsing", e);
        }

        Assert.assertEquals("Lundi", menu.getDayOfWeek());
    }

    @Test
    public void getDayOfWeekUK() {

        Locale ukLocale = new Locale("en", "UK");

        Menu menu = new Menu();
        menu.setLocale(ukLocale);

        try {
            Date day = new SimpleDateFormat(Constants.DATE_PATTERN, ukLocale).parse("2018-12-31");
            menu.setDay(day);
        } catch (ParseException e) {
            LOG.error("Problem with date parsing", e);
        }

        Assert.assertEquals("Monday", menu.getDayOfWeek());
    }

}
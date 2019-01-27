package org.matt.watson.backend.domain.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Menu {

    private long id = -1;
    private Date day;
    private Locale locale;
    private String dayOfWeek;
    private Starter starter;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Menu() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Locale getLocale() {
        if (locale == null) {
            return Locale.getDefault();
        } else {
            return locale;
        }
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getDayOfWeek() {
        if (this.dayOfWeek == null) {
            DateFormat dateFormat = new SimpleDateFormat("EEEE", this.getLocale());
            this.dayOfWeek = upperCaseFirstChar(dateFormat.format(day));
        }
        return this.dayOfWeek;
    }

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    private String upperCaseFirstChar(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", day=" + day +
                ", locale=" + locale +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", starter=" + starter +
                '}';
    }
}

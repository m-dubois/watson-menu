package org.matt.watson.backend.infra.rest.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.matt.watson.backend.infra.rest.Constants;

import java.util.Date;

public class MenuResource {

    private long id = -1;

    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.TIMEZONE, locale = Constants.LOCALE)
    private Date day;
    private String dayOfWeek;
    private MealResource mealResource;

    public MenuResource() {
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

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public MealResource getMealResource() {
        return mealResource;
    }

    public void setMealResource(MealResource mealResource) {
        this.mealResource = mealResource;
    }

    @Override
    public String toString() {
        return "MenuResource{" +
                "id=" + id +
                ", day=" + day +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", mealResource=" + mealResource +
                '}';
    }

}

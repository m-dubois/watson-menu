package org.matt.watson.backend.infra.rest.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.matt.watson.backend.infra.rest.Constants;

import java.util.Date;

@Data
public class MenuResource {
    private long id = -1;

    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.TIMEZONE, locale = Constants.LOCALE)
    private Date day;
    private String dayOfWeek;
    private MealResource meal;
}

package org.matt.watson.backend.infra.rest.resources;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MealResource {
    private StarterResource starter;
    private MainCourseResource mainCourse;
    private DessertResource dessert;
}

package org.matt.watson.backend.infra.rest.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class MealResource {
    private StarterResource starter;
    private MainCourseResource mainCourse;
    private DessertResource dessert;
}

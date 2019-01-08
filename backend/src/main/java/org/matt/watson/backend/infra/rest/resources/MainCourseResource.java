package org.matt.watson.backend.infra.rest.resources;

import lombok.Data;
import lombok.NonNull;

@Data
public class MainCourseResource {
    @NonNull private String name;
}

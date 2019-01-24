package org.matt.watson.backend.infra.rest.resources;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MainCourseResource {
    @NonNull private String name;
}

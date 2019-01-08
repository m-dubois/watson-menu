package org.matt.watson.backend.infra.rest.resources;

import lombok.Data;
import lombok.NonNull;

@Data
public class DessertResource {
    @NonNull
    private String name;
}

package org.matt.watson.backend.infra.rest.resources;

public class MainCourseResource {

    private String name;

    public MainCourseResource(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

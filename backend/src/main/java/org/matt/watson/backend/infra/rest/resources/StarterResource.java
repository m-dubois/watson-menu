package org.matt.watson.backend.infra.rest.resources;

public class StarterResource {

    private String name;

    public StarterResource(String name) {
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

package org.matt.watson.backend.domain.model;

public class Starter extends Course {

    private Long id;

    public Starter() {
        super();
    }

    public Starter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Starter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

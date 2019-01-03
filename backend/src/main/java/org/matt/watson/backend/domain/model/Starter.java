package org.matt.watson.backend.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Starter {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Starter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Starter starter = (Starter) o;

        return name != null ? name.equals(starter.name) : starter.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Starter{" +
                "name='" + name + '\'' +
                '}';
    }
}

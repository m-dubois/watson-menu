package org.matt.watson.backend.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Starter extends Course {

    @Id
    @GeneratedValue
    private Long id;

    @Override
    public String toString() {
        return "Starter{}";
    }
}

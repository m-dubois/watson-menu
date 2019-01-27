package org.matt.watson.backend.infra.repository;

import lombok.Data;
import org.matt.watson.backend.domain.model.Dessert;
import org.matt.watson.backend.domain.model.Starter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "menu")
@Data
public class MenuEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "day", nullable = false)
    Date day;

    @OneToOne
    @JoinColumn(name = "starter_id")
    StarterEntity starter;

    @OneToOne
    @JoinColumn(name = "main_course_id")
    MainCourseEntity mainCourse;

    @OneToOne
    @JoinColumn(name = "dessert_id")
    DessertEntity dessert;
}

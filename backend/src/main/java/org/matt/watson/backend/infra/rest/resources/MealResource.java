package org.matt.watson.backend.infra.rest.resources;

public class MealResource {

    private StarterResource starter;
    private MainCourseResource mainCourse;
    private DessertResource dessert;

    public MealResource(StarterResource starter, MainCourseResource mainCourse, DessertResource dessert) {
        super();
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public StarterResource getStarter() {
        return starter;
    }

    public MainCourseResource getMainCourse() {
        return mainCourse;
    }

    public DessertResource getDessert() {
        return dessert;
    }

    @Override
    public String toString() {
        return "MealResource{" +
                "starter=" + starter +
                ", mainCourse=" + mainCourse +
                ", dessert=" + dessert +
                '}';
    }
}

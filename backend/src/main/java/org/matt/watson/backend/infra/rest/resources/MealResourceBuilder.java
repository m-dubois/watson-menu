package org.matt.watson.backend.infra.rest.resources;

public class MealResourceBuilder {

    private StarterResource starter;
    private MainCourseResource mainCourse;
    private DessertResource dessert;

    public MealResourceBuilder setStarter(StarterResource starter) {
        this.starter = starter;
        return this;
    }

    public MealResourceBuilder setMainCourse(MainCourseResource mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MealResourceBuilder setDessert(DessertResource dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealResource createMealResource() {
        return new MealResource(starter, mainCourse, dessert);
    }
}
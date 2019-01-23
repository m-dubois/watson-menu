package org.matt.watson.backend.infra.repository;

import org.matt.watson.backend.domain.model.Starter;

public class StarterEntityMapper {

    private StarterEntityMapper() {
    }

    public static StarterEntity mapStarterToStarterEntity(Starter starter){
        StarterEntity starterEntity = new StarterEntity();
        starterEntity.setName(starter.getName());

        return starterEntity;
    }

    public static Starter mapStarterEntityToStarter(StarterEntity starterEntity){
        Starter starter = new Starter();
        starter.setName(starterEntity.getName());

        return starter;
    }
}

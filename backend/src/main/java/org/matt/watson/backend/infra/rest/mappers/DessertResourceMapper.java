package org.matt.watson.backend.infra.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Dessert;
import org.matt.watson.backend.infra.rest.resources.DessertResource;

@Mapper
public interface DessertResourceMapper {

    DessertResourceMapper INSTANCE = Mappers.getMapper(DessertResourceMapper.class);

    DessertResource mapDessertToDessertResource(Dessert Dessert);
    Dessert mapDessertResourceToDessert(DessertResource DessertResource);
}

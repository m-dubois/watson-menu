package org.matt.watson.backend.infra.repository;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.Dessert;

@Mapper
public interface DessertEntityMapper {

    DessertEntityMapper INSTANCE = Mappers.getMapper(DessertEntityMapper.class);

    DessertEntity mapDessertToDessertEntity(Dessert dessert);
    Dessert mapDessertEntityToDessert(DessertEntity dessertEntity);
}

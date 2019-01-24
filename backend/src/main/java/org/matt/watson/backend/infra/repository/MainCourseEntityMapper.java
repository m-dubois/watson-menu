package org.matt.watson.backend.infra.repository;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.MainCourse;

@Mapper
public interface MainCourseEntityMapper {

    MainCourseEntityMapper INSTANCE = Mappers.getMapper(MainCourseEntityMapper.class);

    MainCourseEntity mapMainCourseToMainCourseEntity(MainCourse mainCourse);
    MainCourse mapMainCourseEntityToMainCourse(MainCourseEntity mainCourseEntity);
}

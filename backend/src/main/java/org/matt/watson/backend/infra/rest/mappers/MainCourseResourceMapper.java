package org.matt.watson.backend.infra.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.matt.watson.backend.domain.model.MainCourse;
import org.matt.watson.backend.infra.rest.resources.MainCourseResource;

@Mapper
public interface MainCourseResourceMapper {

    MainCourseResourceMapper INSTANCE = Mappers.getMapper(MainCourseResourceMapper.class);

    MainCourseResource mapMainCourseToMainCourseResource(MainCourse MainCourse);
    MainCourse mapMainCourseResourceToMainCourse(MainCourseResource MainCourseResource);
}

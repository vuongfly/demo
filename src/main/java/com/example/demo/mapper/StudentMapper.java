package com.example.demo.mapper;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "name", target = "name")
    Student from(StudentDto dto);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "name", target = "name")
    StudentDto to(Student student);

}

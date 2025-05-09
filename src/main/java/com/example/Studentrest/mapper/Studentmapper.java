package com.example.Studentrest.mapper;

import com.example.Studentrest.dto.StudentDTO;
import com.example.Studentrest.entity.Student;

public class Studentmapper {
    public static StudentDTO toDTO(Student student) {
        return new StudentDTO(
            student.getId(),
            student.getName(),
            student.getEmail(),
            student.getCourse()
        );
    }

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        return student;
    }
}

package com.example.Studentrest.service;

import com.example.Studentrest.dto.StudentDTO;
import java.util.List;

public interface StudentService {
    StudentDTO getStudentById(Long id);
    List<StudentDTO> getAllStudents();
    StudentDTO createStudent(StudentDTO studentDTO);
    StudentDTO updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
}


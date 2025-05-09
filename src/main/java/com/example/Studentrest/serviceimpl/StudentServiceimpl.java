package com.example.Studentrest.serviceimpl;


import com.example.Studentrest.dto.StudentDTO;
import com.example.Studentrest.entity.Student;
import com.example.Studentrest.exception.ResponseNotFoundException;
import com.example.Studentrest.mapper.Studentmapper;
import com.example.Studentrest.repository.Studentrepository;
import com.example.Studentrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceimpl implements StudentService {

    @Autowired
    private Studentrepository repository;

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = repository.findById(id)
            .orElseThrow(() -> new ResponseNotFoundException("Student not found with ID: " + id));
        return Studentmapper.toDTO(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return repository.findAll().stream()
                .map(Studentmapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO createStudent(StudentDTO dto) {
        Student student = Studentmapper.toEntity(dto);
        return Studentmapper.toDTO(repository.save(student));
    }

    @Override
    public StudentDTO updateStudent(Long id, StudentDTO dto) {
        Student student = repository.findById(id)
            .orElseThrow(() -> new ResponseNotFoundException("Student not found with ID: " + id));
        
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        return Studentmapper.toDTO(repository.save(student));
    }

    @Override
    public void deleteStudent(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseNotFoundException("Student not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}

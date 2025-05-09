package com.example.Studentrest.repository;

import com.example.Studentrest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student, Long> {}

package com.enicarthage.elearningbackend.repository;

import com.enicarthage.elearningbackend.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student,Long> {
}

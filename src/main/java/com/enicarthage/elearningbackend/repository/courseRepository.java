package com.enicarthage.elearningbackend.repository;


import com.enicarthage.elearningbackend.model.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<course,Long> {
}

package com.enicarthage.elearningbackend.dao;


import com.enicarthage.elearningbackend.entity.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<course,Long> {
}

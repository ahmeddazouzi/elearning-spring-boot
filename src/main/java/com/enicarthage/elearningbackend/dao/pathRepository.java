package com.enicarthage.elearningbackend.dao;

import com.enicarthage.elearningbackend.entity.Path;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pathRepository extends JpaRepository<Path, Long > {
}

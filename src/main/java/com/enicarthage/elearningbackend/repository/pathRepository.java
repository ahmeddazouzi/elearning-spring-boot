package com.enicarthage.elearningbackend.repository;

import com.enicarthage.elearningbackend.model.Path;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pathRepository extends JpaRepository<Path, Long > {
}

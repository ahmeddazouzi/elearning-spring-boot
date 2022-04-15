package com.enicarthage.elearningbackend.repository;

import com.enicarthage.elearningbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepository extends JpaRepository<Admin,Long> {




    Admin findByemail(String email);
}

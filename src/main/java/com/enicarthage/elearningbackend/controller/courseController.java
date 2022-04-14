package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.model.course;
import com.enicarthage.elearningbackend.repository.courseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/courses/")
@CrossOrigin(origins = "http://localhost:4200")
public class courseController {
    @Autowired
    private courseRepository courseReposotiry ;
   // get all courses
    @GetMapping("/getCourses")
    public List<course> getAllCourses(){
        return courseReposotiry.findAll();


    }



}

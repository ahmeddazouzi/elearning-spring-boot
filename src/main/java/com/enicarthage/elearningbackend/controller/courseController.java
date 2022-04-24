package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.entity.course;
import com.enicarthage.elearningbackend.dao.courseRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/courses")
@CrossOrigin(origins = "http://localhost:4200")
public class courseController {
    @Autowired
    private courseRepository courseReposotiry ;
   // get all courses rest api
    @GetMapping("/getCourses")
    public List<course> getAllCourses(){
        return courseReposotiry.findAll();


    }
    // Create course rest api
    @PostMapping("/createCourse")
    @PreAuthorize("hasRole('User')")
    public course CreateCourse(@RequestBody course course){
        return courseReposotiry.save(course);
    }
    // Get course by id rest api
        @GetMapping("/getCourse/{id}")
    public ResponseEntity<course> getCourseById(@PathVariable Long id){

        course course = courseReposotiry.findById(id).orElseThrow(()->new RuntimeException("no data found "));

             return ResponseEntity.ok(course);
    }


    //    Edit course rest api
    @PutMapping("/updateCourse/{id}")
    public ResponseEntity<course> updateCourse(@PathVariable Long id, @RequestBody course courseDetails ){
        course course = courseReposotiry.findById(id).orElseThrow(()->new RuntimeException("no data found "));
        course.setCategory(courseDetails.getCategory());
        course.setDescriptionCourse(courseDetails.getDescriptionCourse());
        course.setName(courseDetails.getName());
        course.setImgUrlCourse(courseDetails.getImgUrlCourse());
        course updatedCourse =courseReposotiry.save(course);
        return ResponseEntity.ok(updatedCourse);

    }

    // Delete course rest api
    @DeleteMapping("/deleteCourse/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCourse(@PathVariable Long id){

        course course = courseReposotiry.findById(id).orElseThrow(()->new RuntimeException("no data found "));
        courseReposotiry.delete(course);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}

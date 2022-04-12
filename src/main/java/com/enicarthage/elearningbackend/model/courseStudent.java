package com.enicarthage.elearningbackend.model;

import org.aspectj.weaver.NameMangler;

import javax.persistence.*;

@Entity
@Table(name = "courseStudent")
public class courseStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String emailStudent ;
    private String nameCourse ;
    public courseStudent(){}
    public courseStudent(String emailStudent,  String nameCourse) {
        this.emailStudent = emailStudent;
        this.nameCourse=nameCourse;

    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }
}

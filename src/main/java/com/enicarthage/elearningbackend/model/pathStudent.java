package com.enicarthage.elearningbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "pathStudent")
public class pathStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String emailStudent ;
    private String namePath ;
    public pathStudent(){}
    public pathStudent(String emailStudent,  String namepath) {
        this.emailStudent = emailStudent;
        this.namePath=namepath;
    }

    public String getNamePath() {
        return namePath;
    }

    public void setNamePath(String namePath) {
        this.namePath = namePath;
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

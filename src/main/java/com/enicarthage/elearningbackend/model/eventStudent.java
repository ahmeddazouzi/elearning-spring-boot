package com.enicarthage.elearningbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "eventStudent")
public class eventStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String emailStudent ;
    private String nameEvent ;
    public eventStudent(){}
    public eventStudent(String emailStudent,  String nameEvent) {
        this.emailStudent = emailStudent;
        this.nameEvent=nameEvent;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
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

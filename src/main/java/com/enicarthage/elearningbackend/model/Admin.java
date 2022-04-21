package com.enicarthage.elearningbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String email ;
    private String name ;
    private String password ;
    public Admin(){}
    public Admin(String email,String name,String password){
        super();
        this.name=name;
        this.email=email;
        this.password=password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

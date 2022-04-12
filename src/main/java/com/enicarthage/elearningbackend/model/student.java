package com.enicarthage.elearningbackend.model;

public class student {

    private long id ;
    private String firstname ;
    private String lastname ;
    private String email ;
    private String password ;

    public student() {
    }

    public student(String firstname ,String lastname,String email,String password ) {
        super();
        this.firstname = firstname;
        this.lastname=lastname;
        this.email = email;
        this.password=password;
    }



    public String getLastname() {
        return lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

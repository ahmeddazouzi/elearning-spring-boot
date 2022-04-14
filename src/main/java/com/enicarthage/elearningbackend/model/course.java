package com.enicarthage.elearningbackend.model;


import javax.persistence.*;

@Entity
@Table(name = "course")
public class course {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String category ;
    private String descriptionCourse ;
    private String imgUrlCourse ;
     public course (){}
     public course(String name ,String category,String descriptionCourse, String imgUrlCourse ) {
        super();
        this.name=name ;
        this.category = category;
        this.descriptionCourse=descriptionCourse;
        this.imgUrlCourse=imgUrlCourse;

    }

    public String getImgUrlCourse() {
        return imgUrlCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgUrlCourse(String imgUrlCourse) {
        this.imgUrlCourse = imgUrlCourse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescriptionCourse() {
        return descriptionCourse;
    }

    public void setDescriptionCourse(String descriptionCourse) {
        this.descriptionCourse = descriptionCourse;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

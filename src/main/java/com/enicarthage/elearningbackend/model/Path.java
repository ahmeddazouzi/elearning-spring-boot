package com.enicarthage.elearningbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "path")
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String descriptionPath ;
    private String imgUrlPath ;
public Path (){}

    public Path(String name ,String descriptionPath, String imgUrlPath ) {
        super();
        this.name=name ;
        this.descriptionPath=descriptionPath;
        this.imgUrlPath=imgUrlPath;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrlPath() {
        return imgUrlPath;
    }

    public void setImgUrlPath(String imgUrlPath) {
        this.imgUrlPath = imgUrlPath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionPath() {
        return descriptionPath;
    }

    public void setDescriptionPath(String descriptionPath) {
        this.descriptionPath = descriptionPath;
    }
}

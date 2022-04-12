package com.enicarthage.elearningbackend.model;

import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name ;
    private Date date ;
    private String descriptionEvent ;
public Event (){}
    public Event(String name, Date date,String descriptionEvent) {
        super();
        this.name=name;
        this.date = date;
        this.descriptionEvent=descriptionEvent;
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

    public String getDescriptionEvent() {
        return descriptionEvent;
    }

    public void setDescriptionEvent(String descriptionEvent) {
        this.descriptionEvent = descriptionEvent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

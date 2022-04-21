package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.model.Event;
import com.enicarthage.elearningbackend.model.course;
import com.enicarthage.elearningbackend.repository.EventRepository;
import com.enicarthage.elearningbackend.repository.courseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/Events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {
    @Autowired
    private EventRepository EventRepository ;


    // get all Event rest api
    @GetMapping("/getEvents")
    public List<Event> getAllEvents(){
        return EventRepository.findAll();


    }


    // Create Event rest api
    @PostMapping("/createEvent")
    public Event CreateEvent(@RequestBody Event event){
        return EventRepository.save(event);
    }

    // Get Event by id rest api
    @GetMapping("/getEvent/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id){

        Event event = EventRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));

        return ResponseEntity.ok(event);
    }

    //    Edit Event rest api
    @PutMapping("/updateEvent/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event EventDetails ){
        Event event = EventRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));
        event.setName(EventDetails.getName());
        event.setDate(EventDetails.getDate());
        event.setDescriptionEvent(EventDetails.getDescriptionEvent());

        Event updatedEvent =EventRepository.save(event);
        return ResponseEntity.ok(updatedEvent);

    }

    // Delete Event rest api
    @DeleteMapping("/deleteEvent/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEvent(@PathVariable Long id){

        Event event = EventRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));
        EventRepository.delete(event);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }



}

package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.model.Path;

import com.enicarthage.elearningbackend.model.course;
import com.enicarthage.elearningbackend.repository.pathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/paths")
@CrossOrigin(origins = "http://localhost:4200")
public class pathController {
    @Autowired
    private pathRepository pathRepository ;

    // get all path rest api
    @GetMapping("/getPaths")
    public List<Path> getPath(){

        return pathRepository.findAll() ;

    }

    // Create Path rest api
    @PostMapping("/createPath")
    public Path CreatePath(@RequestBody Path path){
        return pathRepository.save(path);
    }



    // Get Path by id rest api
    @GetMapping("/getPath/{id}")
    public ResponseEntity<Path> getPathById(@PathVariable Long id){

        Path path = pathRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));

        return ResponseEntity.ok(path);
    }


    //    Edit Path rest api
    @PutMapping("/updatePath/{id}")
    public ResponseEntity<Path> updatePath(@PathVariable Long id, @RequestBody Path pathDetails ){

        Path path = pathRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));

        path.setName(pathDetails.getName());
        path.setDescriptionPath(pathDetails.getDescriptionPath());
        path.setImgUrlPath(pathDetails.getImgUrlPath());

        Path updatePath =pathRepository.save(path);

        return ResponseEntity.ok(updatePath);

    }


    // Delete Path rest api
    @DeleteMapping("/deletePath/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePath(@PathVariable Long id){

        Path path = pathRepository.findById(id).orElseThrow(()->new RuntimeException("no data found "));
        pathRepository.delete(path);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}

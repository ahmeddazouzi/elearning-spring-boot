package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.model.Admin;
import com.enicarthage.elearningbackend.repository.adminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class adminController {
     @Autowired
    private adminRepository repo ;
     @PostMapping("/adminLogIn")
     public ResponseEntity<?> login(@RequestBody Admin adminData){

   Admin admin =repo.findByemail(adminData.getEmail());
   if (admin.getPassword().equals(adminData.getPassword()))
                 return ResponseEntity.ok(admin);
         return (ResponseEntity<?>) ResponseEntity.internalServerError();
     }


}

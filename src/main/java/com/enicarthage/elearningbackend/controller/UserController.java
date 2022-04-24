package com.enicarthage.elearningbackend.controller;

import com.enicarthage.elearningbackend.dao.UserDao;
import com.enicarthage.elearningbackend.entity.User;
import com.enicarthage.elearningbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    UserDao userDao ;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }



    /* rest point for admin role*/

    @GetMapping({"/admin/getUsers"})
    @PreAuthorize("hasRole('admin')")
    public List<User> forAdmin(){
        return (List<User>) userDao.findAll();
    }


    // rest point for users
    @GetMapping({"/forUser"})
    public String forUser(){
        return "This URL is only accessible to the user";
    }
}


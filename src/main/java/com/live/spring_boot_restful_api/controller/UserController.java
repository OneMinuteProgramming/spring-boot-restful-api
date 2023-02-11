package com.live.spring_boot_restful_api.controller;

import com.live.spring_boot_restful_api.model.User;
import com.live.spring_boot_restful_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getUser(){
        return userService.getUser();
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }
}

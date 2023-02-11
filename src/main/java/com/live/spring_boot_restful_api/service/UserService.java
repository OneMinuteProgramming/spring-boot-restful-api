package com.live.spring_boot_restful_api.service;

import com.live.spring_boot_restful_api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    final List<User> users = List.of(
            new User("A@live.com","Name A", "password"),
            new User("B@live.com","Name B", "password")
    );

    public List<User> getUser(){
        return users;
    }

    public User getUserByName(String name){
        return users.stream().filter(user -> user.getName().equals(name)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No records found"));
    }
}

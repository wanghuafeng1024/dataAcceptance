package com.sishuok.controller;


import com.sishuok.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    private String view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        String s = "success user id " + id;
        return s;
    }

}

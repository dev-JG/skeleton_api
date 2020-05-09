package com.dev.jg.controller;

import com.dev.jg.model.User;
import com.dev.jg.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/dev")
public class SkeletonController {

    private final UserService userService;

    @GetMapping("")
    public String index(){
        return "index page";
    }

    @GetMapping("user")
    public List<User> getUser(){
        return userService.getUserList();
    }
}

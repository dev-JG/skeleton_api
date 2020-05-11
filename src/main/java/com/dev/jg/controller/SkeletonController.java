package com.dev.jg.controller;

import com.dev.jg.model.UserSearchParam;
import com.dev.jg.model.User;
import com.dev.jg.model.UserSearchResult;
import com.dev.jg.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
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

    @GetMapping("userList")
    public UserSearchResult getUserList(@ModelAttribute UserSearchParam searchParam){
       log.info("searchParam = {}", searchParam.toString());

        return userService.getUserListToPaging(searchParam);
    }
}

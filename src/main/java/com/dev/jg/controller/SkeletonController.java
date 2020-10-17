package com.dev.jg.controller;

import com.dev.jg.model.UserSearchParam;
import com.dev.jg.model.User;
import com.dev.jg.model.UserSearchResult;
import com.dev.jg.service.UserService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "index", notes = "기본 페이지")
    @GetMapping("")
    public String index(){
        return "index page";
    }

    @ApiOperation(value = "getUser", notes = "사용자 전체 조회")
    @GetMapping("user")
    public List<User> getUser(){
        return userService.getUserList();
    }

    @ApiOperation(value = "getUserList", notes = "사용자 조회 페이징")
    @GetMapping("userList")
    public UserSearchResult getUserList(@ModelAttribute UserSearchParam searchParam){
       log.info("searchParam = {}", searchParam.toString());

        return userService.getUserListToPaging(searchParam);
    }
}

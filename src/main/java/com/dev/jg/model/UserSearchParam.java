package com.dev.jg.model;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserSearchParam {

    @ApiParam(value = "사용자 번호", required = false)
    private int userNo;

    @ApiParam(value = "사용자 아이디", required = false)
    private String userId;

    @ApiParam(value = "사용자 타입", required = false)
    private String userType;

    @ApiParam(value = "사용자 이름", required = false)
    private String userName;

    @ApiParam(value = "사용자 비밀번호", required = false)
    private String pwd;

    @ApiParam(value = "사용자 상태", required = false)
    private String status;

    @ApiParam(value = "생성일", required = false)
    private LocalDateTime createDate;

    @ApiParam(value = "업데이트일", required = false)
    private LocalDateTime updateDate;

    @ApiParam(value = "페이지 번호", required = false)
    private int page = 1;

    @ApiParam(value = "페이지 사이즈", required = false)
    private int pageSize = 5;
}

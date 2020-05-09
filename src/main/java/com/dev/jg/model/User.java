package com.dev.jg.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    int userNo;

    String userId;

    String userType;

    String userName;

    String pwd;

    String status;

    LocalDateTime createDate;

    LocalDateTime updateDate;
}

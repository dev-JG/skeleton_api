package com.dev.jg.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchResult {
    private int total;
    private List<User> userList;
    private int page;
    private int pageSize;
}

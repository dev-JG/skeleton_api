package com.dev.jg.service;

import com.dev.jg.model.UserSearchParam;
import com.dev.jg.model.User;
import com.dev.jg.model.UserSearchResult;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    UserSearchResult getUserListToPaging(UserSearchParam searchParam);
}

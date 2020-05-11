package com.dev.jg.service.imp;

import com.dev.jg.mapper.UserMapper;
import com.dev.jg.model.UserSearchParam;
import com.dev.jg.model.User;
import com.dev.jg.model.UserSearchResult;
import com.dev.jg.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.selectBySelective();
    }

    @Override
    public UserSearchResult getUserListToPaging(UserSearchParam searchParam) {

        return UserSearchResult.builder()
                .total(userMapper.selectUsersCnt(searchParam))
                .userList(userMapper.selectUsers(searchParam))
                .page(searchParam.getPage())
                .pageSize(searchParam.getPageSize())
                .build();
    }
}

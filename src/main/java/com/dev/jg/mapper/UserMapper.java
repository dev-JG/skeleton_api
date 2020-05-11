package com.dev.jg.mapper;

import com.dev.jg.model.UserSearchParam;
import com.dev.jg.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int selectUsersCnt(UserSearchParam searchParam);

    List<User> selectUsers(UserSearchParam searchParam);

    List<User> selectBySelective();

    User selectByPrimaryKey(int userNo);

    void insertSelective(User user);

    void updateByPrimaryKeySelective(User user);

    void deleteByPrimaryKey(int userNo);
}

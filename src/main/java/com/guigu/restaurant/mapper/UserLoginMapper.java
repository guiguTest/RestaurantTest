package com.guigu.restaurant.mapper;

import com.guigu.restaurant.po.UserLogin;
import com.guigu.restaurant.po.UserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper {
    int countByExample(UserLoginExample example);

    int deleteByExample(UserLoginExample example);

    int deleteByPrimaryKey(Integer loginId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    List<UserLogin> selectByExample(UserLoginExample example);

    UserLogin selectByPrimaryKey(Integer loginId);

    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}
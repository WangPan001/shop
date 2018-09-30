package com.shop.cn.dao;

import com.shop.cn.model.entity.User;
import com.shop.cn.model.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo queryUserInfo(User user);
}
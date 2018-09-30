package com.shop.cn.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.cn.dao.UserInfoMapper;
import com.shop.cn.model.entity.User;
import com.shop.cn.model.entity.UserInfo;
import com.shop.cn.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo queryUserInfo(User user) {
		try {
			UserInfo userInfo = userInfoMapper.queryUserInfo(user);
			return userInfo;
		} catch (Exception e) {
			log.error("查询用户详细信息失败,e={}",e);
		}
		return null;
	}

}

package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserBasicInfo;
import com.example.demo.mapper.UserBasicInfoMapper;
import com.example.demo.service.UserBasicInfoService;

@Service("userBasicInfoServiceImpl")
public class UserBasicInfoServiceImpl implements UserBasicInfoService{

	@Autowired
	UserBasicInfoMapper userBasicInfoMapper;
	
	@Override
	public UserBasicInfo findById(Long id) {
		return userBasicInfoMapper.findById(id);
	}

	@Override
	public List<UserBasicInfo> findAll() {
		return userBasicInfoMapper.findAll();
	}

}

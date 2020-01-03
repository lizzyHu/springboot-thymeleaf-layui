package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.UserBasicInfo;

public interface UserBasicInfoMapper {
	
	UserBasicInfo findById(Long id);
	
    List<UserBasicInfo> findAll();
	
}

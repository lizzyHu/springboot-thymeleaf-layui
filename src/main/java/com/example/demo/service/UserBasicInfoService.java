package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserBasicInfo;

public interface UserBasicInfoService {
	
	UserBasicInfo findById(Long id);
	
    List<UserBasicInfo> findAll();
	
}

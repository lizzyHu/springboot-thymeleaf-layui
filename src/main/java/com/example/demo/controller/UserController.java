package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.UserBasicInfo;
import com.example.demo.service.UserBasicInfoService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name = "userBasicInfoServiceImpl")
	private UserBasicInfoService userBasicInfoService;
	
	@ResponseBody
	@GetMapping("/one")
	public JSONObject findOne(@RequestParam(value = "id") Long id) {
		JSONObject retObj = new JSONObject();
		retObj.put("user", userBasicInfoService.findById(id));
		return retObj;
	}
	
	@ResponseBody
	@GetMapping("/list")
	public JSONObject list() {
		JSONObject retObj = new JSONObject();
		List<UserBasicInfo> list = userBasicInfoService.findAll();
		retObj.put("data", list);
		retObj.put("code", 0);
		retObj.put("count", ((null != list) ? list.size() : 0));
		return retObj;
	}
	
	@GetMapping("/home")
	public String thymeleafHello() {
		return "home";
	}
	
	@GetMapping("/pages/{subUrl}/{operation}")
	public String subMenu(@PathVariable("subUrl") String subUrl, @PathVariable("operation") String operation) {
		
		if (StringUtils.isEmpty(operation)) {
			return "pages/404";
		}
		
		return "/pages/" + subUrl + "/" + operation;
	}
	
}

package com.kam.cloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kam.cloud.service.*;
import com.kam.cloud.service.impl.UserServiceImpl;

import serverCloudApi.entitys.User;

@RestController
public class UserControler {
	@Resource(name="UserServiceImpl")
	private Userservice Userservice;
	@RequestMapping(value ="/findList",method=RequestMethod.GET)
	public Object findList() {
		Userservice.findList();
		return Userservice.findList();
	}
	
	/*
	 * public User findUser(("id") int id) {
	 * 
	 * return new User(); }
	 */
	
}

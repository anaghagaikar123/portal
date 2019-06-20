package com.portal.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.demo.model.User;
import com.portal.demo.service.PortalService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/portal")
public class PortalController {
	
	private static Logger logger = LoggerFactory.getLogger(PortalController.class);
	
	@Autowired
	PortalService portalService;
	
	@RequestMapping("/home")
	public void home()
	{
		logger.info("portal application started");
	}
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers()
	{
		logger.info("Fetching all users");
		List<User> users =portalService.getAllUsers();
		return users;
	}

}

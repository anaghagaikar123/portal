package com.portal.demo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portal.demo.mapper.PortalMapper;
import com.portal.demo.model.User;

@Service
public class PortalService {

	private static Logger logger = LoggerFactory.getLogger(PortalService.class);

	@Autowired
	PortalMapper portal;
	
	public List<User> getAllUsers() {
		logger.info("Getting user details from DB");
		return portal.getAllUsers();
	}

}

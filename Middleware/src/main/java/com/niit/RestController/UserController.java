package com.niit.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.CollaborationBackEnd.dao.UserDao;
import com.niit.CollaborationBackEnd.model.User;

@RestController
public class UserController {
	@Autowired
	UserDao userDao;
	@PostMapping("/addUser")
	public ResponseEntity<String>addUser(@RequestBody User user)
	{
		if(userDao.addUser(user))
		{
			return new ResponseEntity<String>("UserAdded",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Failure",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

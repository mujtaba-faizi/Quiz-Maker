package com.nust.QuizApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nust.QuizApplication.dao.UserDAO;
import com.nust.QuizApplication.model.User;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
    private UserDAO userDao;

   
    @RequestMapping(value = "/signup" ,method = RequestMethod.POST)
    public ResponseEntity<User> create(@RequestBody User user) {
        int id = userDao.signupUser(user);
        if(id>0)
        	return new ResponseEntity<User>(user,HttpStatus.OK);
        else
        	return new ResponseEntity<User>(user,HttpStatus.BAD_REQUEST);
    }
    
    
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    @ResponseBody
    public boolean signinUser(@RequestBody User user) {
    	boolean check = userDao.signinUser(user);
    	if(check==true)
    		return true;
    	else
    		return false;
    }
	
}

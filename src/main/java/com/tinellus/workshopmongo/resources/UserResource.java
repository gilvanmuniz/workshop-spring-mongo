package com.tinellus.workshopmongo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tinellus.workshopmongo.domain.User;
import com.tinellus.workshopmongo.services.UserService;

@RestController
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
}

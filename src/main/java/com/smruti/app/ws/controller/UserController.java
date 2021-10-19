package com.smruti.app.ws.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smruti.app.ws.ui.model.request.UserDetailModelRequest;
import com.smruti.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	Map<String, UserRest> users;

	@GetMapping
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit,
			@RequestParam(value = "sort", required = false) String sort) {

		return "Get user mathod is called with page :  " + page + " and limit = " + limit + " sort as :- " + sort;
	}

	@GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {

		if(users.containsKey(userId)) {
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		}else {
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}
			
	}

	@PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserDetailModelRequest userDetail) {
		UserRest user = new UserRest();
		user.setEmail(userDetail.getEmail());
		user.setFirstname(userDetail.getFirstName());
		user.setLastname(userDetail.getLastName());
		
		String usersId = UUID.randomUUID().toString();
		user.setUserid(usersId);
		
		if(users == null) {
			users = new HashMap<>();
			users.put(usersId, user);
		}

		return new ResponseEntity<UserRest>(user, HttpStatus.OK);
	}

	@PutMapping
	public String updateUser() {
		return "update method called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete method called";
	}
	
	@GetMapping("/getuser")
	public String getuser() {
		return "GEt user ";
	}

}

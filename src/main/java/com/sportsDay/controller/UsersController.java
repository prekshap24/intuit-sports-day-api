package com.sportsDay.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportsDay.dto.CreateUserRequest;
import com.sportsDay.dto.LoginRequest;
import com.sportsDay.dto.LoginResponse;
import com.sportsDay.dto.RegisterEventRequest;
import com.sportsDay.dto.RegisterEventResponse;
import com.sportsDay.dto.Response;
import com.sportsDay.dto.UnRegisterEventRequest;
import com.sportsDay.dto.UnRegisterEventResponse;
import com.sportsDay.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class UsersController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<?> doLogin(@RequestBody LoginRequest loginRequest, HttpServletRequest request) throws Exception {		
		System.out.println("login");
		LoginResponse loginResponse = userService.doLogin(loginRequest);
		return new ResponseEntity<Response>(new Response(loginResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);

	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest) throws Exception {
		System.out.println("createUser");
		String createUserResponse = userService.createUser(createUserRequest);
		return new ResponseEntity<Response>(new Response(createUserResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);

	}
	
	@PostMapping("/registerEvent")
	public ResponseEntity<?> registerEvent(@RequestBody RegisterEventRequest registerEventRequest, HttpServletRequest request) throws Exception {
		System.out.println("Register Event");
		RegisterEventResponse registeredEventsResponse = userService.registerEvent(registerEventRequest);
		return new ResponseEntity<Response>(new Response(registeredEventsResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);
	}
	
	@PostMapping("/unregisterEvent")
	public ResponseEntity<?> unregisterEvent(@RequestBody UnRegisterEventRequest unregisterEventRequest, HttpServletRequest request) throws Exception {
		System.out.println("Unregister Event");
		UnRegisterEventResponse registeredEventsResponse = userService.unregisterEvent(unregisterEventRequest);
		return new ResponseEntity<Response>(new Response(registeredEventsResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);
	}

}
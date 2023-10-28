package com.sportsDay.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportsDay.dto.AllEventsResponse;
import com.sportsDay.dto.RegisteredEventRequest;
import com.sportsDay.dto.RegisteredEventsResponse;
import com.sportsDay.dto.Response;
import com.sportsDay.service.EventsService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class EventsController {

	@Autowired
	private EventsService eventsService;

	@GetMapping("/getAllEvents")
	public ResponseEntity<?> getAllEvents(HttpServletRequest request) throws Exception {		
		System.out.println("All");
		AllEventsResponse allEventsResponse = eventsService.getAllEvents();
		return new ResponseEntity<Response>(new Response(allEventsResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);
	}
	
	@PostMapping("/getRegisteredEvents")
	public ResponseEntity<?> getRegisteredEvents(@RequestBody RegisteredEventRequest registeredEventsRequest, HttpServletRequest request) throws Exception {
		System.out.println("Registered");
		RegisteredEventsResponse registeredEventsResponse = eventsService.getRegisteredEvents(registeredEventsRequest);
		return new ResponseEntity<Response>(new Response(registeredEventsResponse, HttpStatus.OK, LocalDate.now()), HttpStatus.OK);
	}

}
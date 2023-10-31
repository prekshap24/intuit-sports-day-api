package com.sportsDay.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsDay.dto.AllEventsResponse;
import com.sportsDay.dto.Event;
import com.sportsDay.dto.RegisteredEventRequest;
import com.sportsDay.dto.RegisteredEventsResponse;
import com.sportsDay.exception.EmptyInputException;
import com.sportsDay.model.EventDetails;
import com.sportsDay.repository.EventDetailsRepository;
import com.sportsDay.repository.UserEventDetailsRepository;
import com.sportsDay.service.EventsService;

@Service
public class EventsServiceImpl implements EventsService{
	
	@Autowired
	private EventDetailsRepository eventDetailsRepository;
	
	@Autowired
	private UserEventDetailsRepository userEventDetailsRepository;

	@Override
	@Transactional
	public AllEventsResponse getAllEvents() {
		List<EventDetails> data = new ArrayList<>();
		data = eventDetailsRepository.findAll();
		
		AllEventsResponse response = new AllEventsResponse();
		List<Event> allData = new ArrayList<>();
		for(int i=0;i<data.size();i++) {
			EventDetails details = data.get(i);
			Event event = new Event();
			event.setEventId(details.getEventId());
			event.setEventName(details.getEventName());
			event.setEventCategory(details.getEventCategory());
			event.setStartTime(details.getStartTime());
			event.setEndTime(details.getEndTime());
			allData.add(event);
		}
		response.setEvent(allData);
		return response;
	}

	@Override
	@Transactional
	public RegisteredEventsResponse getRegisteredEvents(RegisteredEventRequest registeredEventsRequest) {
		List<Object> data = new ArrayList<>();
		if(registeredEventsRequest.getUserId()==null || registeredEventsRequest.getUserId()==""
				|| registeredEventsRequest.getUserId().isBlank()) {
			throw new EmptyInputException("User Id cannot be empty");
		}
		data = userEventDetailsRepository.findByUserId(registeredEventsRequest.getUserId());
		
		RegisteredEventsResponse response = new RegisteredEventsResponse();
		List<Event> allData = new ArrayList<>();
		for(int i=0;i<data.size();i++) {
			Object[] object = (Object[]) data.get(i);		
			Event event = new Event();
			event.setEventId((String) object[1]);
			event.setEventName((String) object[2]);
			event.setEventCategory((String) object[5]);
			event.setStartTime((String) object[3]);
			event.setEndTime((String) object[4]);
			allData.add(event);
		}
		response.setEvents(allData);
		return response;
	}

}

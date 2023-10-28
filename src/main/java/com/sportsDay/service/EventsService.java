package com.sportsDay.service;

import com.sportsDay.dto.AllEventsResponse;
import com.sportsDay.dto.RegisteredEventRequest;
import com.sportsDay.dto.RegisteredEventsResponse;

public interface EventsService {

	AllEventsResponse getAllEvents();

	RegisteredEventsResponse getRegisteredEvents(RegisteredEventRequest allEventsRequest);

}

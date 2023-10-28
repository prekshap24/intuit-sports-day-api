package com.sportsDay.dto;

import java.util.List;

public class RegisteredEventsResponse {
	
	private List<Event> events;

	/**
	 * @return the events
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "RegisteredEventsResponse [events=" + events + "]";
	}

}

package com.sportsDay.dto;

import java.util.List;

public class AllEventsResponse {
	
	private List<Event> event;

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "AllEventResponse [event=" + event + "]";
	}
	
	

}

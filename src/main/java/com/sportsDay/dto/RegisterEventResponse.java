package com.sportsDay.dto;

public class RegisterEventResponse {
	
	private String userId;
	private String eventId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	@Override
	public String toString() {
		return "RegisterEventResponse [userId=" + userId + ", eventId=" + eventId + "]";
	}
}

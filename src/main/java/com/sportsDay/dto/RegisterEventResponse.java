package com.sportsDay.dto;

public class RegisterEventResponse {
	
	private String userId;
	private String eventName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	@Override
	public String toString() {
		return "RegisterEventResponse [userId=" + userId + ", eventName=" + eventName + "]";
	}
}

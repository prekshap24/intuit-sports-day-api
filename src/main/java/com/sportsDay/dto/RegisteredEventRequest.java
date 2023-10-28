package com.sportsDay.dto;

public class RegisteredEventRequest {
	
	private String userId;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "RegisteredEventRequest [userId=" + userId + "]";
	}

}

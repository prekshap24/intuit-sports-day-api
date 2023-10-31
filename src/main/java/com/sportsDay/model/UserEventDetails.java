package com.sportsDay.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEventDetails {

	@Id
	private int id;
	private String userId;
	private String eventId;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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

	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "UserEventDetails [id=" + id + ", userId=" + userId + ", eventId=" + eventId + "]";
	}

}

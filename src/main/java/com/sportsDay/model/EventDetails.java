package com.sportsDay.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EventDetails {
	
	@Id
	private String eventId;
	private String eventName;
	private String eventCategory;
	private String startTime;
	private String endTime;
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
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the eventCategory
	 */
	public String getEventCategory() {
		return eventCategory;
	}
	/**
	 * @param eventCategory the eventCategory to set
	 */
	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Eventdetails [eventId=" + eventId + ", eventName=" + eventName + ", eventCategory=" + eventCategory
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}

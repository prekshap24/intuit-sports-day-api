package com.sportsDay.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userId;
	private String userContactNumber;
	private String userEmailId;


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @return the userContactNumber
	 */
	public String getUserContactNumber() {
		return userContactNumber;
	}

	/**
	 * @return the userEmailId
	 */
	public String getUserEmailId() {
		return userEmailId;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @param userContactNumber
	 *            the userContactNumber to set
	 */
	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	/**
	 * @param userEmailId
	 *            the userEmailId to set
	 */
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userContactNumber=" + userContactNumber
				+ ", userEmailId=" + userEmailId + "]";
	}


}

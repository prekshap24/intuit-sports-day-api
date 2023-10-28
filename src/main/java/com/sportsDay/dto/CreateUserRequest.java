package com.sportsDay.dto;

public class CreateUserRequest {
	
	private String userName;
	private String userId;
	private String userContactNumber;
	private String userEmailId;
	private String userPassword;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the userContactNumber
	 */
	public String getUserContactNumber() {
		return userContactNumber;
	}
	/**
	 * @param userContactNumber the userContactNumber to set
	 */
	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	/**
	 * @return the userEmailId
	 */
	public String getUserEmailId() {
		return userEmailId;
	}
	/**
	 * @param userEmailId the userEmailId to set
	 */
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "CreateUserRequest [userName=" + userName + ", userId=" + userId + ", userContactNumber="
				+ userContactNumber + ", userEmailId=" + userEmailId + ", userPassword=" + userPassword + "]";
	}
	
	

}

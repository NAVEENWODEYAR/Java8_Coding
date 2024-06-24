package com.coding.entity;
/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202411:13:37 am
 * @classDef com.coding
 */
public class UsersData {
	
	private Long userId;
	
	private String userName;
	
	private String userMail;

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

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
	 * @return the userMail
	 */
	public String getUserMail() {
		return userMail;
	}

	/**
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public UsersData() {}
	
	/**
	 * @param userId
	 * @param userName
	 * @param userMail
	 */
	public UsersData(Long userId, String userName, String userMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
	}
	
	
}

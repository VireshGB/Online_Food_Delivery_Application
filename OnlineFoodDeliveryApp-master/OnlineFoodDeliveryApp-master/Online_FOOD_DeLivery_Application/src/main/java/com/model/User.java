package com.model;

import java.time.LocalDateTime;

public class User {
	private int userId;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private String userName;
	private String password;
	private String role;
	private LocalDateTime createdDate;
	private LocalDateTime lastlogin;
	private int restaurantOwnerId;

	public User(int userId, String name, String email, String phoneNo, String address, String userName, String password,
			String role, LocalDateTime createdDate, LocalDateTime lastlogin) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.createdDate = createdDate;
		this.lastlogin = lastlogin;
	}

	public User(int userId, String name, String email, String phoneNo, String address, String userName, String password,
			String role, LocalDateTime createdDate, LocalDateTime lastlogin, int restaurantOwnerId) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.createdDate = createdDate;
		this.lastlogin = lastlogin;
		this.restaurantOwnerId = restaurantOwnerId;
	}

	public User(int userId, String name, String email, String phoneNo, String address, String userName, String password,
			LocalDateTime createdDate, LocalDateTime lastlogin) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.createdDate = createdDate;
		this.lastlogin = lastlogin;
	}

	public User(int userId, String userName, String encryotedPassword) {
		this.userId = userId;
		this.userName = userName;
		this.password = encryotedPassword;
	}

	public User(int userId, String name, String email, String phoneNo, String address, String userName,
			String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public User(int userId, String name, String email, String phoneNo, String address, String userName, String password,
			String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(LocalDateTime lastlogin) {
		this.lastlogin = lastlogin;
	}

	public int getRestaurantOwnerId() {
		return restaurantOwnerId;
	}

	public void setRestaurantOwnerId(int restaurantOwnerId) {
		this.restaurantOwnerId = restaurantOwnerId;
	}

}

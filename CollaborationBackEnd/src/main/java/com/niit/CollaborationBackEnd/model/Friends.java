package com.niit.CollaborationBackEnd.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Friends {
	private int friendId;
	private String friend_u_username;
	private String status;
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriend_u_username() {
		return friend_u_username;
	}
	public void setFriend_u_username(String friend_u_username) {
		this.friend_u_username = friend_u_username;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}

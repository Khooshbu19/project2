package com.niit.CollaborationBackEnd.dao;

import java.util.List;

import com.niit.CollaborationBackEnd.model.Friends;
import com.niit.CollaborationBackEnd.model.User;

public interface FriendsDao {
	public List<Friends>showFriendList(String u_username);
	public List<Friends>showPendingFriendRequest(String u_username);
	public List<User>showSuggestFriend(String u_username);
	public boolean sendFriendRequest(Friends friends);
	public boolean acceptFriendRequest(int friendId);
	public boolean deleteFriendRequest(int friendId);
	

}

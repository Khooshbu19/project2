package com.niit.CollaborationBackEnd.daoImpl;

import java.util.List;


import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CollaborationBackEnd.dao.FriendsDao;
import com.niit.CollaborationBackEnd.model.Friends;
import com.niit.CollaborationBackEnd.model.User;

@Transactional
@Repository("friendDao")
public class FriendsDaoImpl implements FriendsDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Friends> showFriendList(String u_username) {
	
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Friends where loginname=:u_username");
		query.setParameter("u_username",u_username);
		List<Friends>listFriend=query.list();
		return listFriend ;
	}

	@Override
	public List<Friends> showPendingFriendRequest(String u_username) {
		
		return null;
	}

	@Override
	public List<User> showSuggestFriend(String u_username) {
		
		return null;
	}

	@Override
	public boolean sendFriendRequest(Friends friends) {
		
		return false;
	}

	@Override
	public boolean acceptFriendRequest(int friendId) {
	
		return false;
	}

	@Override
	public boolean deleteFriendRequest(int friendId) {
		
		return false;
	}
	

}

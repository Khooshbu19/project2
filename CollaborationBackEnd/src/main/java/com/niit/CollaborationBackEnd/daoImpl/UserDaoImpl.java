package com.niit.CollaborationBackEnd.daoImpl;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.CollaborationBackEnd.dao.UserDao;
import com.niit.CollaborationBackEnd.model.User;


@Transactional
@Repository("userDao")
public class UserDaoImpl implements UserDao {
@Autowired
private SessionFactory sessionFactory;
	public boolean addUser(User user) {
		sessionFactory.getCurrentSession().persist(user);
		return true;
	}

}

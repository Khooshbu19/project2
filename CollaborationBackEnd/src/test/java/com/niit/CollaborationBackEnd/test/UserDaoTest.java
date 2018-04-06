
package com.niit.CollaborationBackEnd.test;

import org.junit.BeforeClass;

import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackEnd.dao.UserDao;
import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;
import com.niit.CollaborationBackEnd.model.User;

public class UserDaoTest {

	static UserDao userDao;
	static User user;
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		context.scan("com.niit.CollaborationBackEnd");
		System.out.println("done");
		userDao = (UserDao) context.getBean("userDao");
		user = (User) context.getBean("user");

	}

	@Test
	public void addUser() {
//		user.setU_username("Nishant");
//		user.setU_Password("Nisahant");
//		user.setU_confirmPassword("Nishant");
//		userDao.addUser(user);
//
	}

}

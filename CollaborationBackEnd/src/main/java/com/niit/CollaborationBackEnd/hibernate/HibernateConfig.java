package com.niit.CollaborationBackEnd.hibernate;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;


import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.CollaborationBackEnd.model.Blog;
import com.niit.CollaborationBackEnd.model.Job;
import com.niit.CollaborationBackEnd.model.User;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.niit.CollaborationBackEnd")
public class HibernateConfig {
	@Bean(name="dataSource")
	public DataSource geth2DataSource()
	{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("social");
		dataSource.setPassword("social");
		return dataSource;		
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionFactory=new LocalSessionFactoryBuilder(dataSource);
		
		sessionFactory.addAnnotatedClass(User.class);
		sessionFactory.addAnnotatedClass(Blog.class);
		sessionFactory.addAnnotatedClass(Job.class);

		sessionFactory.addProperties(getHibernateProperties());
		
		return sessionFactory.buildSessionFactory();
		
	}
	public Properties getHibernateProperties()
	{

		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		return properties;
	}
	@Autowired
	@Bean
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}


}

package com.niit.CollaborationBackEnd.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackEnd.dao.JobDao;
import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;
import com.niit.CollaborationBackEnd.model.Job;

public class JobTest {
	static JobDao jobDao;
	 static Job job;
	 static AnnotationConfigApplicationContext context;
	 @BeforeClass
	 public static void init()
	 {
		 context =new AnnotationConfigApplicationContext(HibernateConfig.class);
		 context.scan("com.niit.CollaborationBackEnd");
		 jobDao=(JobDao)context.getBean("jobDao");
		 job=(Job)context.getBean("job");
		 
	 }
	@Test
	public void addJobTest() {
		job.setCompany("----");
		job.setJobDesc("-----");
		//job.setLastDateApply();
		job.setLocation("-----");
		job.setSalary(12334);
	}
	@Test
	public void deleteJobTest()
	{
	//	jobDao.getJob();
	//	assretTrue("problem in deletion",jobDao.delete(job));
	}

}

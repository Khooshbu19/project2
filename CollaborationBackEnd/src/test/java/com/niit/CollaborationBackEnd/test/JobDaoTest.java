/*
package com.niit.CollaborationBackEnd.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackEnd.dao.JobDao;
import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;
import com.niit.CollaborationBackEnd.model.Job;

public class JobDaoTest {
	
		@Autowired
		static JobDao jobDao;
		@Autowired
		 static Job job;
		 static AnnotationConfigApplicationContext context;
		 @BeforeClass
		 public static void init()
		 {
			 context=new AnnotationConfigApplicationContext(HibernateConfig.class);
			context.scan("com.niit.CollaborationBackEnd");
			//context.refresh();
			 jobDao=(JobDao)context.getBean("jobDao");
			 job=(Job)context.getBean("job");
			
		 }
		 @Ignore
		@Test
		public void addJobTestCase() {
			job.setCompany("abcd");
			job.setJobDesc("programmer");
			job.setLocation("delhi");
			job.setSalary(4000);
			jobDao.addJob(job);
			
		}
		@Ignore
		@Test
		public void deleteJobTest()
		{
			job=jobDao.getJob(54);
		
			
			assertTrue("problem in deletion",jobDao.delete(job));
		}
		
		
		@Ignore
		@Test
		public void updateJobTest()
		{
			job=jobDao.getJob(51);
			job.setCompany("def");
			job.setLocation("Mumbai");
			assertTrue("problem in updation",jobDao.update(job));
		}
		@Ignore
		@Test
		public void listJobsTest()
		{
			List<Job> listJobs=jobDao.listAllJobs();
			assertNotNull("problem in listingjob",listJobs);
			for(Job job:listJobs)
			{
				System.out.println("job description"+job.getJobDesc());
			}
		}

	}

*/


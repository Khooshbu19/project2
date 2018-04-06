package com.niit.CollaborationBackEnd.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.CollaborationBackEnd.dao.JobDao;
import com.niit.CollaborationBackEnd.model.Job;
@Transactional
@Repository("jobDao")
public class JobDaoImpl implements JobDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addJob(Job job) {
		sessionFactory.getCurrentSession().persist(job);
		return false;
	}

	public boolean delete(Job job) {
		sessionFactory.getCurrentSession().delete(job);
		return false;
	}

	public boolean update(Job job) {
	sessionFactory.getCurrentSession().update(job);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Job> listAllJobs() {
		return(List<Job>)sessionFactory.getCurrentSession().createQuery("from Job").list();
		
	}


	public Job getJob(int jobId) {
	Session session=sessionFactory.openSession();
	Job job=(Job) sessionFactory.getCurrentSession().get(Job.class, jobId);
		return job;
	}

}

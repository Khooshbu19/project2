package com.niit.CollaborationBackEnd.dao;

import java.util.List;

import com.niit.CollaborationBackEnd.model.Job;

public interface JobDao {
	public boolean addJob(Job job);
	public boolean delete(Job job);
	public boolean update(Job job);
	public List<Job>listAllJobs();
	public Job getJob(int jobId);
	

}

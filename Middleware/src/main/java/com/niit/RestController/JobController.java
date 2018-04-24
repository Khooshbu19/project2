package com.niit.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.CollaborationBackEnd.dao.JobDao;
import com.niit.CollaborationBackEnd.model.Job;

@RestController
public class JobController {
	@Autowired
	JobDao jobDao;
	
	@PostMapping("/addJob")
	public ResponseEntity<String>addJob(@RequestBody Job job)
	{
		if(jobDao.addJob(job))
		{
		return new ResponseEntity<String>("JobAdded",HttpStatus.OK) ;
		}
		else
		{
			return new ResponseEntity<String>("Failure",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}

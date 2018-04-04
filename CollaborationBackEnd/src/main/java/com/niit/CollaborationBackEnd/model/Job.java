package com.niit.CollaborationBackEnd.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;
@Entity
@Component
@SequenceGenerator(name="jobIdseq",sequenceName="myjob_seq")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="jobseq")
	 private int jobId;
	private String company;
	private int salary;
	private String location;
	private String jobDesc;
	private Date lastDateApply;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getLastDateApply() {
		return lastDateApply;
	}
	public void setLastDateApply(Date lastDateApply) {
		this.lastDateApply = lastDateApply;
	}



}

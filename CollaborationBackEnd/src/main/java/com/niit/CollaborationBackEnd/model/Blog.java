package com.niit.CollaborationBackEnd.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Component
@SequenceGenerator(name="blogIdseq",sequenceName="myblog_seq")
public class Blog {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="blogseq")
	private	int blogId;
	private	String blogName;
	private String blogContent;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date CreateDate;
	private int likes;
	private String loginname;
	//private String b_status;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	
	
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	/*public String getB_status() {
		return b_status;
	}
	public void setB_status(String b_status) {
		this.b_status = b_status;
	}*/
	
	
	
}

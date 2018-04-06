package com.niit.CollaborationBackEnd.dao;

import java.util.List;

import com.niit.CollaborationBackEnd.model.Blog;
import com.niit.CollaborationBackEnd.model.BlogComment;

public interface BlogDao {
	public boolean addBlog(Blog blog);
	public boolean deleteBlog(int blogId);
	public boolean updateBlog(Blog blog);
	public List<Blog> getlistBlogs(String u_username);
	public boolean approveBlog(Blog blog);
	public boolean rejectBlog(Blog blog);
	public Blog getBlog(int blogId);
	public List<Blog> getlistAllBlogs();
	public boolean incrementLike(Blog blog);
	
	public boolean addBlogComment(BlogComment blogComment);
	public boolean deleteBlogComment(BlogComment blogComment);
	public BlogComment getBlogComment(int commentId);
	public List<BlogComment>listBlogComments(int blogId);


}

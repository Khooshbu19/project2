package com.niit.CollaborationBackEnd.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.niit.CollaborationBackEnd.dao.BlogDao;
import com.niit.CollaborationBackEnd.model.Blog;
import com.niit.CollaborationBackEnd.model.BlogComment;

@Transactional
@EnableWebMvc
@Repository("blogDao")
public class BlogDaoImpl implements BlogDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addBlog(Blog blog) {
		sessionFactory.getCurrentSession().save(blog);
		return true;
	}

	public boolean deleteBlog(int blogId) {
		Blog blog = (Blog) sessionFactory.getCurrentSession().get(Blog.class, blogId);
		sessionFactory.getCurrentSession().delete(blog);
		return true;
	}

	public boolean updateBlog(Blog blog) {
		sessionFactory.getCurrentSession().update(blog);
		return true;
	}

	@SuppressWarnings("deprecation")
	public List<Blog> listBlogs(String u_username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Blog Where loginname=:u_username");
		query.setParameter("u_username", u_username);
		
		List<Blog> listBlogs = query.list();
		System.out.println(listBlogs);
		return listBlogs;
	}

	public boolean approveBlog(Blog blog) {
		// blog.setStatus("A");
		sessionFactory.getCurrentSession().update(blog);

		return true;
	}

	public boolean rejectBlog(Blog blog) {
		// blog.setStatus("na");
		sessionFactory.getCurrentSession().update(blog);
		return true;
	}

	public Blog getBlog(int blogId) {
		Session session = sessionFactory.openSession();
		Blog blog = (Blog) sessionFactory.getCurrentSession().get(Blog.class, blogId);
		return blog;
	}

	public List<Blog> listAllBlogs() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Blog");
		List<Blog> listBlogs = query.list();
		return listBlogs;
	}

	public boolean incrementLike(Blog blog) {
		// blog.setB_status("");
		sessionFactory.getCurrentSession().update(blog);
		return true;
	}

	public boolean addBlogComment(BlogComment blogComment) {
		sessionFactory.getCurrentSession().persist(blogComment);
		return true;
	}

	public boolean deleteBlogComment(BlogComment blogComment) {
		sessionFactory.getCurrentSession().delete(blogComment);
		return true;
		
	}

	public BlogComment getBlogComment(int commentId) {
		Session session = sessionFactory.openSession();
		BlogComment blogComment = (BlogComment) sessionFactory.getCurrentSession().get(BlogComment.class,commentId);
		return blogComment;
	}

	public List<BlogComment> listBlogComments(int blogId) {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from BlogComment");
		List<BlogComment> listBlogComments = query.list();
		return listBlogComments;
	}

}

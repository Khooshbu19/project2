
package com.niit.CollaborationBackEnd.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackEnd.dao.BlogDao;
import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;
import com.niit.CollaborationBackEnd.model.Blog;
import com.niit.CollaborationBackEnd.model.BlogComment;

import junit.framework.Assert;

public class BlogTest {
	@Autowired
	 static BlogDao blogDao;
	@Autowired
	 static Blog blog;
	@Autowired
	static BlogComment blogComment;
	
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		context.scan("com.niit.CollaborationBackEnd");
		//context.refresh();
		blogDao=(BlogDao)context.getBean("blogDao");
		blog=(Blog)context.getBean("blog");
		//System.out.println("abcd");
	}
	
	@Test
	public void addBlogTestCase() {
		
		blog.setBlogName("abcu");
		blog.setBlogContent("abcu");
		blog.setCreateDate(new java.util.Date());
		blog.setLikes(2);
		blog.setLoginname("yoo");
		//blog.setB_status("A");
		blogDao.addBlog(blog);
		Assert.assertEquals(blog, true);
		
	}
	@Ignore
	@Test
	public void listBlogsByUserTest()
	{
		List<Blog>listBlogs=blogDao.listBlogs("nishant");
		//assertTrue("problem in listing blogs",listBlogs.size()>0);
		System.out.println(listBlogs);
		for(Blog blog:listBlogs)
		{
			System.out.println(blog.getBlogName()+":-");
			System.out.println(blog.getLoginname()+":-");
			System.out.println(blog.getBlogContent()+":-");
		}
	}
	@Ignore
	@Test
	public void incrementBlogLikesTest()
	{
		blog=blogDao.getBlog(51);
		assertTrue("problem in Incrementof likes :",blogDao.incrementLike(blog));
	}

	
	

}

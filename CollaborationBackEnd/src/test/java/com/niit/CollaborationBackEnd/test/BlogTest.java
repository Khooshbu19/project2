
package com.niit.CollaborationBackEnd.test;




import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.CollaborationBackEnd.dao.BlogDao;
import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;
import com.niit.CollaborationBackEnd.model.Blog;

public class BlogTest {
	 static BlogDao blogDao;
	 static Blog blog;
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		context.scan("com.niit.CollaborationBackEnd");
		blogDao=(BlogDao)context.getBean("blogDao");
		blog=(Blog)context.getBean("blog");
		System.out.println("abcd");
	}

	@Test
	public void addBlog() {
		
		blog.setBlogName("abcu");
		blog.setBlogContent("abcu");
		//blog.setCreateDate();
		blog.setLikes(2);
		blog.setLoginname("Nishant");
		//blog.setB_status("A");
		blogDao.addBlog(blog);
	}
	
	

}

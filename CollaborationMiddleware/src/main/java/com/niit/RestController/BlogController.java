package com.niit.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.CollaborationBackEnd.dao.BlogDao;
import com.niit.CollaborationBackEnd.model.Blog;

@RestController
public class BlogController {
	@Autowired
	BlogDao blogDao;
/*	@GetMapping("/showAllApprovedBlogs")
	public ResponseEntity<List<Blog>>showAllApprovedBlogs()
		{
			List<Blog>listBlogs=blogDao.listBlogs("----");
			if(listBlogs!=null)
			{
			return new ResponseEntity<List<Blog>>(listBlogs,HttpStatus.OK)	;
			}
			else
			{
				return new ResponseEntity<List<Blog>>(listBlogs,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}*/
	@PostMapping("/addBlog")
	public ResponseEntity<String> addBlog(@RequestBody Blog blog)
	{
		if(blogDao.addBlog(blog))
		{
			return new ResponseEntity<String>("BlogAdded",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Failure",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}

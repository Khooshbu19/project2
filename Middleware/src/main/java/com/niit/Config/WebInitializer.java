package com.niit.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.niit.CollaborationBackEnd.hibernate.HibernateConfig;



public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private static final Logger log=LoggerFactory.getLogger(WebInitializer.class);
	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.debug("Starting of Method getRootConfigClasses");
		log.debug("Ending of method getRootConfigClasses");
		
		return new Class[] {WebResolver.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.debug("Starting of Method getServletConfigClasses");
		log.debug("Ending of method getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		log.debug("Starting of Method getServletMappings");
		
		return new String[] {"/"};
	}

}


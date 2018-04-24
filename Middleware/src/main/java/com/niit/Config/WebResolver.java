package com.niit.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.niit")

public class WebResolver extends WebMvcConfigurerAdapter{
	private static final Logger log=LoggerFactory.getLogger(WebResolver.class);
	@Bean
	public ViewResolver viewResolver()
	{
		log.debug("Starting of Method viewResolver");
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		log.debug("Ending of the Method viewResolver");
		return viewResolver;
		}


}

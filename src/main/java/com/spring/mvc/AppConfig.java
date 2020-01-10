package com.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.spring.mvc"})
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver v = new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/views/");
		v.setSuffix(".jsp");
		return v;
	}

}

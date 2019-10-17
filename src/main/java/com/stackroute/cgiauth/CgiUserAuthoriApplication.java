package com.stackroute.cgiauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.stackroute.cgiauth.jwtfilter.JwtMyFilter;
@ComponentScan(basePackages="com.stackroute.cgiauth")
@SpringBootApplication
public class CgiUserAuthoriApplication {

	@Bean

	public FilterRegistrationBean jwtFilter() {
	final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	registrationBean.setFilter(new JwtMyFilter());
	registrationBean.addUrlPatterns("/api/*");
	return registrationBean;
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(CgiUserAuthoriApplication.class, args);
	}

}

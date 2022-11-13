package com.tripy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class TripyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripyApplication.class, args);
	}
	 @Bean
	  public InternalResourceViewResolver defaultViewResolver() {
	    return new InternalResourceViewResolver();
	  }

}

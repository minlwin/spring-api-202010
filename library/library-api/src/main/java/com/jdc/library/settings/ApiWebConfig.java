package com.jdc.library.settings;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jdc.library.model.BaseRepositoryImpl;

@Configuration
@EnableWebMvc
@EnableJpaRepositories(basePackages = "com.jdc.library.model", repositoryBaseClass = BaseRepositoryImpl.class)
public class ApiWebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("*");
	}
}

package com.wenxt.integrationserv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@SpringBootApplication
@PropertySource("classpath:common_msgs.properties")
@Configuration
@EnableJpaRepositories
public class IntegrationserviceApplication {

	
	@Value("${spring.allowed.origin}")
	private String allowedOrigin;

	public static void main(String[] args) {
		SpringApplication.run(IntegrationserviceApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins(allowedOrigin.split(","));
			}
		};
	}

}

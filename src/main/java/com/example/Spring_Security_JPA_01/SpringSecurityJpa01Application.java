package com.example.Spring_Security_JPA_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpa01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpa01Application.class, args);
	}

}

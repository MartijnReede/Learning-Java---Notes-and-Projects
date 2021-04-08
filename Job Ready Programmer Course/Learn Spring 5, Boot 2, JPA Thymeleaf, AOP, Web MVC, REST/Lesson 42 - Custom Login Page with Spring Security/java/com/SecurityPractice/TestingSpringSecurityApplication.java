package com.SecurityPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.SecurityPractice.DAO.UserRepository;
import com.SecurityPractice.Entities.User;

@SpringBootApplication
public class TestingSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingSpringSecurityApplication.class, args);
	}
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository usRepo;
	
	@Bean
	CommandLineRunner runner() {
		
		return args -> {
			
			User user = new User("martijn", encoder.encode("test"), "test@gmail.com");
			user.setRole("ROLE_ADMIN");
			
			User user2 = new User("harry", encoder.encode("test"), "test2@Gmail.com"); 
			
			usRepo.save(user);
			usRepo.save(user2);
		};
	}
}

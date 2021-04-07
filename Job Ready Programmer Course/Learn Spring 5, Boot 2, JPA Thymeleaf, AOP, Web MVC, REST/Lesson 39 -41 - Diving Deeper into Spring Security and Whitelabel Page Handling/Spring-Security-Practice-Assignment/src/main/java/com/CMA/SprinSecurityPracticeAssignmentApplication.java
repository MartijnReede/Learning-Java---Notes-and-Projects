package com.CMA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.CMA.DAO.UserRepository;
import com.CMA.entities.User;

@SpringBootApplication
public class SprinSecurityPracticeAssignmentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SprinSecurityPracticeAssignmentApplication.class, args);
	}
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository usRepo;
	
	
	@Bean
	CommandLineRunner runner() {
		
		return args -> {
			
			User user1 = new User("martijn", encoder.encode("test"), "test@gmail.com");
			user1.setRole("ROLE_ADMIN");
			usRepo.save(user1);	
		};
	}
}

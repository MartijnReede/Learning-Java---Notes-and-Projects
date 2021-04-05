

package com.jobready.pma.security;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("test").password("pass").roles("USER")
		.and().withUser("test2").password("pass2").roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//NOT MENTIONED IN THE LESSON, BUT SAVING TO THE DATABASE IS DISABLED WITH SPRING SECURITY!!!
		//TO MAKE THIS POSSIBLE USE THIS LINE OF CODE:
		http.csrf().disable(); //THIS MAKES THE APPLICATION LESS SECURE!
		
		http.authorizeRequests()
		.antMatchers("/projects/new").hasRole("ADMIN")
		.antMatchers("/employees/new").hasRole("ADMIN")
		.antMatchers("/").authenticated().and().formLogin();
	}
	
}


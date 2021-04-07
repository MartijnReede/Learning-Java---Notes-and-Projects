package com.CMA.security;

import javax.sql.DataSource; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BCryptPasswordEncoder bCryptEncoder;
	
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		
		auth.jdbcAuthentication()
		.usersByUsernameQuery("select username, password, enabled " +
		"from USERS where username = ?" )
		.authoritiesByUsernameQuery("select username, role from USERS where username = ?" )
		.dataSource(dataSource).passwordEncoder(bCryptEncoder);	
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/h2-console/**").hasRole("ADMIN") //Lets admins use the H2-Console
		.anyRequest().authenticated().and().formLogin();
		
		
		http.csrf().ignoringAntMatchers("/h2-console/**"); //Ignores  the protection against CSRF attacks(NOT GOOD FOR PROD!) 
		http.headers().frameOptions().disable();
	}
}

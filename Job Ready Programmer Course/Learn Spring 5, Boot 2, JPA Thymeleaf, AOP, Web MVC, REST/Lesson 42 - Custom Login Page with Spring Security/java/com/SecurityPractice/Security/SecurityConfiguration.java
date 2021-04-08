package com.SecurityPractice.Security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	DataSource datasource;

	//Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.usersByUsernameQuery("select username, password, enabled from USERS where username = ?")
		.authoritiesByUsernameQuery("select username, role from USERS where username = ?")
		.dataSource(datasource).passwordEncoder(encoder);
	}
	
	
	//Authorization....
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/user/**").hasRole("USER")
		.antMatchers("/h2-console/**").hasRole("ADMIN")
		.antMatchers("/logout/**").permitAll()
		.antMatchers("/login/**").permitAll()
		.antMatchers("/register/**").permitAll()
		.antMatchers("/**").authenticated().and().formLogin().loginPage("/login");
		

		http.csrf().ignoringAntMatchers("/h2-console/**");
		http.headers().frameOptions().disable();
	}

}

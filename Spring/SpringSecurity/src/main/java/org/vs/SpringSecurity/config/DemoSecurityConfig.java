package org.vs.SpringSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.permitAll();
		
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//@SuppressWarnings("deprecation")
		UserBuilder users=User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication().withUser(users.username("john").password("test1").roles("EMPLOYEE"))
		.withUser(users.username("mary").password("test12").roles("MANAGER"))
		.withUser(users.username("kary").password("test123").roles("ADMIN"));
		
		
	}
	
	
	
}

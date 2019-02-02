package com.acc;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
public class WebMvcSecurityConfig extends WebSecurityConfigurerAdapter {
	/**
	 * Defines Security Using InMemory
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Balmiki").password("miki").roles("admin");
		auth.inMemoryAuthentication().withUser("Rupali").password("Rupali").roles("User");
	}
	
	/**
	 * This Method Defines Role Based Security
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("admin").anyRequest().fullyAuthenticated().and().httpBasic();
	}
	@SuppressWarnings("deprecation")
	public static NoOpPasswordEncoder getEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}

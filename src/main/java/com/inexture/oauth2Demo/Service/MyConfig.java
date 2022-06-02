package com.inexture.oauth2Demo.Service;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class MyConfig  extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http
		  .antMatcher("/**").authorizeRequests()
          .antMatchers(new String[]{"/", "/local"}).permitAll()
          .anyRequest().authenticated()
          .and()
          .oauth2Login()
          .defaultSuccessUrl("/index")
          .and()
          .logout();
		

	}
}

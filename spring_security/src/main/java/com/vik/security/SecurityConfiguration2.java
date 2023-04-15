package com.vik.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.vik.filter.JwtRequestFilter;
import com.vik.service.MyUserDetailService;

@EnableWebSecurity
public class SecurityConfiguration2 extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private MyUserDetailService myUserDetailService;
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(myUserDetailService);
		
		
		// Set your configuration on the auth object
		/*
		 * auth.inMemoryAuthentication() .withUser("blah") .password("blah")
		 * .roles("USER") .and() .withUser("foo") .password("foo") .roles("ADMIN");
		 */
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    
    @Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
	 * .antMatchers("/user").hasAnyRole("ADMIN", "USER")
	 * .antMatchers("/").permitAll() .and().formLogin(); }
	 */
    
    @Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
    	System.out.println(" SecurityConfiguration2 : configure(HttpSecurity httpSecurity)............");
		httpSecurity.csrf().disable()
				.authorizeRequests().antMatchers("/authenticate").permitAll().
						anyRequest().authenticated().and().
						exceptionHandling().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

	}

}

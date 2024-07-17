package com.wenxt.integrationserv.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final SecurityProperties securityProperties;

    public SecurityConfig(SecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }

    @Bean
  
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF protection for simplicity (adjust as per your application's requirements)
            .authorizeRequests(authorizeRequests -> authorizeRequests
                .requestMatchers("/YiCover/save").authenticated()  // Requires authentication for /YiCover/save
                .requestMatchers("/charges/save").authenticated() // Requires authentication for /charges/save
                .anyRequest().permitAll()                     // Permits access to any other request
            )
            .httpBasic();                                     // Enables HTTP Basic authentication

        return http.build();
    }

 


	@Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername(securityProperties.getName())
            .password("{noop}" + securityProperties.getPassword()) // {noop} indicates no password encoding
            .roles("USER")
            .build());
        return manager;
    }
}

package com.arun.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/account", "/balance", "/cards", "/loans").authenticated()
                .requestMatchers("/contact", "/notices").permitAll()
                .and().formLogin(withDefaults()).httpBasic(withDefaults());
        return http.build();
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.marconivr.demoJWT.config;

import it.marconivr.demoJWT.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Patrizia
 */

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    
    private final UserRepository repository;
    
    @Bean
    public UserDetailsService userDetailsService(){
        return username -> repository.findByEmail(username)
                        .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }
}

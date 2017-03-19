/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.fbclient.impl.restfb.config;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * configure the RestFB client to be used.  The access token should be defined
 * in the properties file.
 * 
 * @author scott
 */
@Configuration
public class RestFBConfig {
    
    @Value("${com.blazartech.products.fbclient.impl.restfb.token}")
    private String token;
    
    @Bean
    public FacebookClient getFacebookClient() {
        return new DefaultFacebookClient(token, Version.LATEST);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.fbclient.impl.restfb.config;

import com.blazartech.products.crypto.BlazarCryptoFile;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    private BlazarCryptoFile cryptoFile;
    
    @Value("${com.blazartech.products.fbclient.impl.restfb.token.resourceID}")
    private String tokenResourceID;
    
    @Value("${com.blazartech.products.fbclient.impl.restfb.token.userID}")
    private String tokenUserID;    
    
    @Bean
    public FacebookClient getFacebookClient() {
        return new DefaultFacebookClient(cryptoFile.getPassword(tokenUserID, tokenResourceID), Version.LATEST);
    }
}

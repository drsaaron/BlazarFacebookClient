/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.fbclient.impl.restfb;

import com.blazartech.products.fbclient.BTFacebookClient;
import com.blazartech.products.fbclient.Status;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implement the facebook client using RestFB.
 * 
 * @author scott
 */
@Service
public class BTFacebookClientRestFBImpl implements BTFacebookClient {

    @Autowired
    private FacebookClient restClient;
    
    private static final Logger logger = Logger.getLogger(BTFacebookClientRestFBImpl.class);
    
    @Override
    public void postStatus(Status status) {
        logger.info("posting status to facebook.");
        FacebookType response = restClient.publish("me/feed", FacebookType.class, Parameter.with("message", status.getText()));
        logger.info("response = " + response.toString());    
    }
    
}

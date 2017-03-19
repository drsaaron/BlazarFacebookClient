/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.products.fbclient;

/**
 * interface for a component to post to facebook.
 * 
 * @author scott
 * @version $Id: BTFacebookClient.java 10 2016-10-30 21:08:20Z scott $
 */
public interface BTFacebookClient {
    
    /**
     * post a status update.
     * 
     * @param status 
     */
    public void postStatus(Status status);
}

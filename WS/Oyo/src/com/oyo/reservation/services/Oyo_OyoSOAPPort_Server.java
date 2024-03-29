
package com.oyo.reservation.services;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.9
 * 2018-07-23T10:58:28.595+05:30
 * Generated source version: 2.6.9
 * 
 */
 
public class Oyo_OyoSOAPPort_Server{

    protected Oyo_OyoSOAPPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new OyoImpl();
        String address = "http://localhost:8081/oyo";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Oyo_OyoSOAPPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}

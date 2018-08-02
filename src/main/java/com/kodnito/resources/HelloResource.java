/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodnito.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author hayricicek
 */
@Path("hello")
public class HelloResource {
    
    @GET
    public String hello() {
        return "Hello MicroProfile";
    }
}

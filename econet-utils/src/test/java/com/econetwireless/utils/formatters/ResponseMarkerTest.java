/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.utils.formatters;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kinah
 */
public class ResponseMarkerTest {
    
    public ResponseMarkerTest() {
    }
    
    
    /**
     * Test of getMarker method, of class ResponseMarker.
     */
    @Test
    public void testGetMarker() {
        System.out.println("getMarker");
        String responseCode = "200";
        String expResult = "[SUCCESS] ";
        String result =  ResponseMarker.getMarker(responseCode);
        
        System.out.println("....."+result);
        assertEquals(expResult, result);
    }
    
}

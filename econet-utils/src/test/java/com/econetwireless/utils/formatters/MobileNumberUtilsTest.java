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
public class MobileNumberUtilsTest {
    
    public MobileNumberUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of formatMobileNumber method, of class MobileNumberUtils.
     */
    @Test
    public void testFormatMobileNumber() {
        System.out.println("formatMobileNumber");
        String mobileNumber = "0785898366";
        String expResult = "785898366";
        String result = MobileNumberUtils.formatMobileNumber(mobileNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatMobileToInternationalMode method, of class MobileNumberUtils.
     */
    @Test
    public void testFormatMobileToInternationalMode() {
        System.out.println("formatMobileToInternationalMode");
        String mobileNumber = "785898366";
        String expResult = "263785898366";
        String result = MobileNumberUtils.formatMobileToInternationalMode(mobileNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class MobileNumberUtils.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "0785898366+";
        boolean expResult = false;
        boolean result = MobileNumberUtils.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MobileNumberUtils.
     */
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MobileNumberUtils.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of isInitiatorSameAsBeneficiary method, of class MobileNumberUtils.
     */
    @Test
    public void testIsInitiatorSameAsBeneficiary() {
        System.out.println("isInitiatorSameAsBeneficiary");
        String initiatorMobileNumber = "0785898366";
        String beneficiaryMobileNumber = "785898369";
        boolean expResult = false;
        boolean result = MobileNumberUtils.isInitiatorSameAsBeneficiary(initiatorMobileNumber, beneficiaryMobileNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

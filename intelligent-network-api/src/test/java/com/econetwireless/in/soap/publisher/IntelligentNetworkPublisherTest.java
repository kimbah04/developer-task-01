/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.in.soap.publisher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 *
 * @author kinah
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@WebMvcTest(IntelligentNetworkPublisher.class)
public class IntelligentNetworkPublisherTest {
  @Autowired
  private MockMvc mvc;  


    /**
     * Test of main method, of class IntelligentNetworkPublisher.
     */
    @Test
    public void intelligentNetworkPublisher() throws Exception {
        mvc.perform(get("http://localhost:8888/intelligent-network-api/IntelligentNetworkService?wsdl"))
                .andExpect(content().string("<!--  Published by JAX-WS RI (http://jax-ws.java.net). RI's version is JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e.  -->\n" +
"<!--  Generated by JAX-WS RI (http://jax-ws.java.net). RI's version is JAX-WS RI 2.2.9-b130926.1035 svn-revision#5f6196f2b90e9460065a4c2f4e30e065b245e51e.  -->\n" +
"<definitions xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\" xmlns:wsp=\"http://www.w3.org/ns/ws-policy\" xmlns:wsp1_2=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsam=\"http://www.w3.org/2007/05/addressing/metadata\" xmlns:soap12=\"http://schemas.xmlsoap.org/wsdl/soap12/\" xmlns:tns=\"http://service.soap.in.econetwireless.com/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"http://schemas.xmlsoap.org/wsdl/\" targetNamespace=\"http://service.soap.in.econetwireless.com/\" name=\"IntelligentNetworkServiceImpl\">\n" +
"<types>\n" +
"<xsd:schema>\n" +
"<xsd:import namespace=\"http://service.soap.in.econetwireless.com/\" schemaLocation=\"http://localhost:8888/intelligent-network-api/IntelligentNetworkService?xsd=1\"/>\n" +
"</xsd:schema>\n" +
"</types>\n" +
"<message name=\"enquireBalance\">\n" +
"<part name=\"parameters\" element=\"tns:enquireBalance\"/>\n" +
"</message>\n" +
"<message name=\"enquireBalanceResponse\">\n" +
"<part name=\"parameters\" element=\"tns:enquireBalanceResponse\"/>\n" +
"</message>\n" +
"<message name=\"creditSubscriberAccount\">\n" +
"<part name=\"parameters\" element=\"tns:creditSubscriberAccount\"/>\n" +
"</message>\n" +
"<message name=\"creditSubscriberAccountResponse\">\n" +
"<part name=\"parameters\" element=\"tns:creditSubscriberAccountResponse\"/>\n" +
"</message>\n" +
"<portType name=\"IntelligentNetworkService\">\n" +
"<operation name=\"enquireBalance\">\n" +
"<input wsam:Action=\"http://service.soap.in.econetwireless.com/IntelligentNetworkService/enquireBalanceRequest\" message=\"tns:enquireBalance\"/>\n" +
"<output wsam:Action=\"http://service.soap.in.econetwireless.com/IntelligentNetworkService/enquireBalanceResponse\" message=\"tns:enquireBalanceResponse\"/>\n" +
"</operation>\n" +
"<operation name=\"creditSubscriberAccount\">\n" +
"<input wsam:Action=\"http://service.soap.in.econetwireless.com/IntelligentNetworkService/creditSubscriberAccountRequest\" message=\"tns:creditSubscriberAccount\"/>\n" +
"<output wsam:Action=\"http://service.soap.in.econetwireless.com/IntelligentNetworkService/creditSubscriberAccountResponse\" message=\"tns:creditSubscriberAccountResponse\"/>\n" +
"</operation>\n" +
"</portType>\n" +
"<binding name=\"IntelligentNetworkPortBinding\" type=\"tns:IntelligentNetworkService\">\n" +
"<soap12:binding transport=\"http://schemas.xmlsoap.org/soap/http\" style=\"document\"/>\n" +
"<operation name=\"enquireBalance\">\n" +
"<soap12:operation soapAction=\"\"/>\n" +
"<input>\n" +
"<soap12:body use=\"literal\"/>\n" +
"</input>\n" +
"<output>\n" +
"<soap12:body use=\"literal\"/>\n" +
"</output>\n" +
"</operation>\n" +
"<operation name=\"creditSubscriberAccount\">\n" +
"<soap12:operation soapAction=\"\"/>\n" +
"<input>\n" +
"<soap12:body use=\"literal\"/>\n" +
"</input>\n" +
"<output>\n" +
"<soap12:body use=\"literal\"/>\n" +
"</output>\n" +
"</operation>\n" +
"</binding>\n" +
"<service name=\"IntelligentNetworkServiceImpl\">\n" +
"<port name=\"IntelligentNetworkPort\" binding=\"tns:IntelligentNetworkPortBinding\">\n" +
"<soap12:address location=\"http://localhost:8888/intelligent-network-api/IntelligentNetworkService\"/>\n" +
"</port>\n" +
"</service>\n" +
"</definitions>"));
    }
    
}

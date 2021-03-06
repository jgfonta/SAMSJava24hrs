package com.java24hours.ws;

import java.net.*; 
import javax.xml.namespace.*;
import javax.xml.ws.*; 

public class SquareRootClient 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		URL url = new URL("http://127.0.0.1:5335/service?wsdl");
		QName qname = new QName("http://ws.java24hours.com/","SquareRootServerImplService");
		Service service = Service.create(url, qname);
		SquareRootServer srs = service.getPort(SquareRootServer.class);
		System.out.println(srs.getTime());
		// Get the square root of 625 double 
		System.out.println(srs.getSquareRoot(625D));
	}
}
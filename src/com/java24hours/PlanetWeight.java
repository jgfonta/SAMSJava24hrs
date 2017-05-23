package com.java24hours;

public class PlanetWeight {

	public static void main(String[] args) {
		double earthGavity = 1;
		double mercuryGavity = .378;
		double moonGavity = .166;
		double jupiterGavity = 2.364;
		double weight = 178;

		double earth = weight * earthGavity;
       	double mercury = weight * mercuryGavity;
       	double moon = weight * moonGavity;
       	double jupiter = weight * jupiterGavity;
		
       	System.out.print("Your weight on Earth is "); 
       	System.out.println(earth); 
       	System.out.print("Your weight on Mercury is ");
       	System.out.println(mercury);
       	System.out.print("Your weight on the Moon is ");
       	System.out.println(moon);
       	System.out.print("Your weight on Jupiter is ");
       	System.out.println(jupiter);
		 
	}

}

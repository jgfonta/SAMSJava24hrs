package com.java24hours;

public class SpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
		String mostFamous = "Rudolph the Red-Nosed Reindeer";    
		System.out.println(mostFamous);	             
		char[] mfl = mostFamous.toCharArray();          
		for (int dex = 0; dex < mfl.length; dex++) 
		{              
			char current = mfl[dex];              
			if (mfl[dex] != ' ' & current != '-') 
			{                 
				System.out.print(current);	             
			} 
			else 
			{
				System.out.print('_');
			}
		}         
		System.out.println();
		
		// Try a different way
		for (int dex = 0; dex < mostFamous.length(); dex++) 
		{              
			char current = mostFamous.charAt(dex);              
			if (mostFamous.charAt(dex) != ' ' & mostFamous.charAt(dex) != '-') 
			{                 
				System.out.print(mostFamous.charAt(dex));	             
			} 
			else 
			{
				System.out.print('*');
			}
		}         
		System.out.println();
	}

}

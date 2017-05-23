package com.java24hours;

public class Nines {

	public static void main(String[] args) {
        int i = 0;
		for (int dex = 1; dex <= 200; dex++) { 
			int multiple = 9 * dex;
			i++;
			if (i < 10) {
			   System.out.print(multiple + "\t");
			} else
			{
			   System.out.println(multiple + "\t");
			   i = 0;
			}
		} 
		System.out.println();
	
	
	}

}

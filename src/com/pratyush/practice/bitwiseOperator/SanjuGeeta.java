package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;
 
class SanjuGeeta
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int a = sc.nextInt();
		
		 
		
		if(a%3 ==0 && a%5==0)
		
			System.out.println("Sanju weds Geeta");
		
		else if (a%5==0)
		
			System.out.println("Geeta");
			
		
		else if(a%3 ==0)
		
			System.out.println("Sanju  ");
		
		else
		
			System.out.println("Break up");
		
		
		 
	}
}
package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;
 
class Result
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of physics :");
		int p = sc.nextInt();
		
		System.out.println("Enter the marks of Chemistry :");
		int c = sc.nextInt();
		
		System.out.println("Enter the marks of Mathematics :");
		int m = sc.nextInt();
		
		System.out.println("Enter the marks of Biology :");
		int b = sc.nextInt();
		
		 String res;
		 
		if(p<35||c<35||m<35||b<35)
		{
			res="Fail";
		}
		else
		{
			double perc=(p+c+m+b)/4.0;
			if(perc >=85)
		
				res="Distingtion";
				
			else if (perc>=60)
		
				res="FirstClass";
		
			else if (perc>=50)
		
				res="SecondClass";
			
		
			else 
		
				res="pass";
		
		}
		
		System.out.println("Result "+res);
		
		 
	}
}
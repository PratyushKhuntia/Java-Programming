package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;
 
class Middle
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		 
		
		    if(a>b && a<c || a>c && a<b)
		   
				System.out.println(" middle number is "+a);
		   
     
		    else if(b>a && b<c || b>c && b<a)
			
				System.out.println(" middle number is "+b);
		    else
		    	System.out.println(" middle number is "+c);
     
			 
			 
		 
	}
}
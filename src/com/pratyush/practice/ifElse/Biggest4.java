package com.pratyush.practice.ifElse;

import java.util.Scanner;
 
class Biggest4
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		 
		
		    if(a>b && a>c && a>d)
		    {
				System.out.println(" Biggest number is "+a);
		    }
     
			else if(b>c && b>d)
			{
				System.out.println(" Biggest number is "+b);
			}
     
			else if(c>d)
			{
				System.out.println(" Biggest number is "+c);
			}
			else
				
			System.out.println(" Biggest number is "+d);
			 
		 
	}
}
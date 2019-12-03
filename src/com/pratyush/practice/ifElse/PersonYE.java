package com.pratyush.practice.ifElse;

import java.util.Scanner;
class PersonYE
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Person name :");
		String n1=sc.next();
		System.out.println("Enter First Person age :");
		int a1=sc.nextInt();
		System.out.println("Enter Second Person name :");
		String n2=sc.next();
		System.out.println("Enter second person age :");
		int a2=sc.nextInt();
		
		if(a1<a2)
		{
			 System.out.println("younger person is :"+n1);
			  System.out.println("Elder person is :"+n2);
		}
		 else
		 {
			  System.out.println("younger person is :"+n2);
			  System.out.println("Elder person is :"+n1);
		 }
	}
	
}
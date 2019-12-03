package com.pratyush.practice.conditionalOperator;

import java.util.Scanner;
class Vote
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a person name :" );
		String name = sc.next();
		
		System.out.println("Enter a person age :" );
		int age = sc.nextInt();
		 
		 if(age>=18)
			 System.out.println(name+" can vote");
		 else
		     System.out.println(name+" can not vote");
		 
		 String st=(age>=18)?"can":"can not";
		 System.out.println(name+st+"vote");
		 
	}
}
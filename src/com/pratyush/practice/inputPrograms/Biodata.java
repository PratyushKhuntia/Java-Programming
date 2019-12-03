package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class Biodata
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your mobile number : ");
		long mob=sc.nextLong();
		System.out.println("Enter 10th percentage :");
		float p1=sc.nextFloat();
		System.out.println("Enter +2 percentage :");
		float p2=sc.nextFloat();
		System.out.println("Enter degree percentage :");
		float p3=sc.nextFloat();
		System.out.println("Enter your Stream :");
		String wings=sc.next();
		
		System.out.println("My name is "+name);
		System.out.println("My Mobile number is "+mob);
		System.out.println("My 10th percentage is "+p1);
		System.out.println("My 12th percentage is "+p2);
		System.out.println("My Degree percentage is "+p3);
		System.out.println("My Streem is "+wings);
		
	}
}
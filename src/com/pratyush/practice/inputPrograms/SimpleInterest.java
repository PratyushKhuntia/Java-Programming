package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class SimpleInterest
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal ammount : ");
		float pa=sc.nextFloat();
		
		System.out.println("Enter the rate of interest : ");
		float rate=sc.nextFloat();
		
		System.out.println("Enter the Time : ");
		int time=sc.nextInt();
		
		double si=(pa*rate*time)/100;
		System.out.println("Simple Interest = "+si);
	}
}
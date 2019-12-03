package com.pratyush.practice.ifElse;

import java.util.Scanner;
class SmallNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		float f1=sc.nextFloat();
		System.out.println("Enter second number :");
		float f2=sc.nextFloat();
		
		if(f1<f2)
		{
			 System.out.println("Smallest number is :"+f1);
		}
		 else
		 {
			  System.out.println("Smallest number is :"+f2);
		 }
	}
	
}
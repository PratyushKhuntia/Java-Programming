package com.pratyush.practice.conditionalOperator;

import java.util.Scanner;
class EvenOdd6
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		 
		  String st=(n%2==0)?"Even":"Odd";
		  System.out.println(n+"is"+st+"number");
	}
}
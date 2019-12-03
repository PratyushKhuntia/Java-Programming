package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class EvenOdd3
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String st[]={"Even","Odd"};
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		System.out.println(n+"is"+st[n/2]+"number");
		
		
		 
	}
}
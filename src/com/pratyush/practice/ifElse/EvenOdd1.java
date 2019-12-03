package com.pratyush.practice.ifElse;

import java.util.Scanner;
class EvenOdd1
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		
		if(n%2==1)
		{
			System.out.println(n+"is a odd number");
		}
		else
		{
			System.out.println(n+"is a even number");
		}
	}
}
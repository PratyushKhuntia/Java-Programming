package com.pratyush.practice.ifElse;

import java.util.Scanner;
class Spacial
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		
		int d1= n/10;
		int d2= n%10;
		System.out.println(d1);
		System.out.println(d2);
		int sum = d1+d2+d1*d2;
		
		if(sum == n)
		{
			System.out.println(n+"is a spacial character");
		}
		else
		{
			System.out.println(n+"is not a spacial character");
		}
		System.out.println("Thank you");
	}
}
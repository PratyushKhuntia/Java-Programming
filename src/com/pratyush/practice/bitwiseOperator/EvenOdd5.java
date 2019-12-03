package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;
class EvenOdd5
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		 
		 if((n&1)==0)
			 System.out.println(n+"is a even number");
		 else
		     System.out.println(n+"is a odd number");
		 
	}
}
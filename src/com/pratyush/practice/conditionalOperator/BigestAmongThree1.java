package com.pratyush.practice.conditionalOperator;

import java.util.Scanner;
 
class BigestAmongThree1
{
	public static void main(String arg[])
	{
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the valueof a :" );
		int a = sc.nextInt();
		System.out.println("Enter the valueof b :" );
		int b = sc.nextInt();
		System.out.println("Enter the valueof c :" );
		int c = sc.nextInt();
		 
		 int big=(a>b && a>c)?a:(b>c)?b:c;
		 System.out.println(big+" is bigest number.");
	}
}
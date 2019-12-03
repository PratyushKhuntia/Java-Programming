package com.pratyush.practice.switchCase;

import java.util.Scanner;
class EvenOdd4
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :" );
		int n = sc.nextInt();
		 
		 switch(n%2)
		 {
			 case 0: System.out.println(n+"Is even number");
			 break;
			 case 1: System.out.println(n+"is odd number");
			 break;
		 }
		
		
		 
	}
}
package com.pratyush.practice.ifElse;

import java.util.Scanner;
 
class SmallestAmongThree
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
		if(a>b)
		{
			if(a>c)
			System.out.println(a+"is biggest");
		else
			System.out.println(c+"is biggest");
		}
 
		else if(b>c)
		System.out.println(b+"is biggest");
	else
		System.out.println(c+"is biggest");
		 
	}
}
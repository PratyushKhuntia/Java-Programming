package com.pratyush.practice.Method;

import java.util.Scanner;

public class FactorialM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = sc.nextInt();
		System.out.println("factorial of "+no+" is"+fact(no));
		 

	}
	
	static int fact(int n)
	{
		int f=1;
		while(n>1)
		{
			f=f*n;
			n--;
		}
		 return f;
	}
}

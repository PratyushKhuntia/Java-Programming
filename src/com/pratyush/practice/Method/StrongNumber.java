package com.pratyush.practice.Method;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		boolean rs = isstrong(n);
				if(rs)
					System.out.println(n+" is a Strong no.");
				else
					System.out.println(n+" is not a strong no.");
		
	}
	
	static boolean isstrong(int n)
	{
		int sum=0,t=n;
		do {
			int r=n%10;
			 sum=sum+fact(r);
			 			 
			n=n/10;
		} while (n!=0);
		
		return sum==t;
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

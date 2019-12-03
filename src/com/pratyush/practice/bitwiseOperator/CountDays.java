package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;
 
class CountDays
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year :");
		int n = sc.nextInt();
		int d=0;
		for(int y=1;y<=n;y++)
		{
		 
		 if(y%400==0||y%4==0&&y%100!=0)
			 
			 d=d+366;
		
		else
		
			d=d+365;		
		
		}
		System.out.println(d);
		 
		
		 
	}
}
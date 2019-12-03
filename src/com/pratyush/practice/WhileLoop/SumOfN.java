package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int i=1,s=0;
		while(i<=n)
		{
			s=s+n;
			i++;
			
		}
		
		System.out.println("sum of"+n+"numbers="+s);
		

	}

}

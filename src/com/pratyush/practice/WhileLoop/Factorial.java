package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int i=1,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			 
			 i++;
		}
		System.out.println(fact);
	}

}

package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class Name_N_Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int i=1;
		while(i<=n)
		{
			 System.out.println(name);
			 i++;
		}
		

	}

}

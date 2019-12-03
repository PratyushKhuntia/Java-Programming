package com.pratyush.practice.Method;

import java.util.Scanner;

public class Vote {
	static void vote(int age)
	{
		if(age>=18)
			System.out.println("You can vote.");
		else
			System.out.println("You can't vote.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int a=sc.nextInt();
		vote(a);
		
	}

}

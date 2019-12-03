package com.pratyush.practice.Method;

import java.util.Scanner;

public class FactorialOf_n_Nos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+"!= "+fact(i));
		}

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

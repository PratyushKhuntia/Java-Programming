package com.pratyush.practice.Method;

import java.util.Scanner;

public class PrimeBet_n {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range : ");
		int n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			boolean rs=isPrime(i);
			if(rs)
				System.out.print(i+" ");
			
		}

	}
	
	static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}

}

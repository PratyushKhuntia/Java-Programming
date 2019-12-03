package com.pratyush.practice.Method;

import java.util.Scanner;

public class CountPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting point : ");
		int s = sc.nextInt();
		System.out.println("Enter ending point : ");
		int e = sc.nextInt();
		int count=0 ;
		
		for (int i = s; i <=e; i++) {
			boolean rs=isPrime(i);
			if(rs && i!=1) 
				 
			count++;
			
		}
		System.out.println("Total prime number between"+s+" to "+e+" is "+count);

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

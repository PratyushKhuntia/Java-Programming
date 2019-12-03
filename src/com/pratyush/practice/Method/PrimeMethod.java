package com.pratyush.practice.Method;

import java.util.Scanner;

public class PrimeMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = sc.nextInt();
		boolean rs=isPrime(no);
		if(rs)
			System.out.println(no+"is Prime no");
		else
			System.out.println(no+"is not Prime no");
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

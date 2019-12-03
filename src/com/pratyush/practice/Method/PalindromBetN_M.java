package com.pratyush.practice.Method;

import java.util.Scanner;

public class PalindromBetN_M {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number :");
		int s=sc.nextInt();
		System.out.println("Enter the ending number :");
		int e=sc.nextInt();
		int count=0;
		for(int i=s;i<=e;i++) {
		boolean rs = isPalindrom(i);
		if(rs) {
			 System.out.println(i+" ");
			count++;
		}
		}
		System.out.println("total  "+count);
	}
	static boolean isPalindrom(int n)
	{
		return n==reverse(n);
	}
	
	static int reverse(int n)
	{
		int rev=0;
		do {
			int r=n%10;
			 
			rev=rev*10+r;
			 
			n=n/10;
		} while (n!=0);
		
		return rev;
	

}

}

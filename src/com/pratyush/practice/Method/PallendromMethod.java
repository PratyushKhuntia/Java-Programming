package com.pratyush.practice.Method;

import java.util.Scanner;

public class PallendromMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		boolean rs = isPalindrom(n);
		if(rs)
			System.out.println(n+" is a palindrom.");
		else
			System.out.println(n+" is not a palindrom.");
	
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

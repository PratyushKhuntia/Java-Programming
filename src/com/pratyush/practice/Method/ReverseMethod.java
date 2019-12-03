package com.pratyush.practice.Method;

import java.util.Scanner;

public class ReverseMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		int rev=reverse(no);
		System.out.println("Reverse of "+no+" is "+rev);
		//System.out.println("Reverse of 3487 is "+reverse(3487));
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

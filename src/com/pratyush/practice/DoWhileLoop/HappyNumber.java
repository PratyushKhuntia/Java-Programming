package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(n>9)
		{
			int sum=0;
			do {
				int r=n%10;
				sum=sum+r*r;
				n=n/10;				
			}while(n !=0);
			n=sum;
			
		}
		System.out.println(n);
		if(n==1||n==7)
			System.out.println("Happy number");
		else
			System.out.println("Not a happy number");
	}

}

package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  t=n,count=0;
		do {
			count ++;
			 n=n/10;
		} while (n!=0);
		
		System.out.println("number of digits in "+t+" is "+count);

	}

}

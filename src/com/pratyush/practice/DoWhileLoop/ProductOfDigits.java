package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int  t=n,pro=1;
		 
		do {
			 
			int r=n%10;
			pro=pro*r;
			n=n/10;
		   } while (n!=0);
		 
		System.out.println("Product of digits in "+t+" is "+pro);

	}
	

}

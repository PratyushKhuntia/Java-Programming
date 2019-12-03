package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  t=n,sum=0;
		 
		do {
			 
			int r=n%10;
			sum=sum+r;
			n=n/10;
		   } while (n!=0);
		 
		System.out.println("sum of digits in "+t+" is "+sum);

	}

}

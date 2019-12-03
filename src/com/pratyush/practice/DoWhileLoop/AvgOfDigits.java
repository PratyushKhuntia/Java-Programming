package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class AvgOfDigits {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int  t=n,sum=0,count=0;
		 
		do {
			 
			count++;
			n=n/10;
			sum=sum+n;
		   } while (n!=0);
		
		double avg=sum/count;
		 
		System.out.println("Average of digits in "+t+" is "+avg);

		
	}

}

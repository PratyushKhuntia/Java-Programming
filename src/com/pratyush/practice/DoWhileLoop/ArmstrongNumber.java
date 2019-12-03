package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  t=n,sum=0 ;
		 
		do {
			 
			int r=n%10;
			  
			 sum=sum+r*r*r;
			 
			n=n/10;
		   } while (n!=0);
		 
		if(sum==t)
			System.out.println(t+" is an amstrong number");
		else
			System.out.println(t+" is not an amstrong number");
	}

}

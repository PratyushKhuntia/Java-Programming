package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int i=1,se=0,so=0;
		while(i<=n)
		{
			 if(i%2==0)
			 {
				 se=se+i;
			 }
			 else
			 {
				 so=so+i;
			 }
			 i++;
		}
		System.out.println("Sum of even numbers between 1 to "+n+" is "+se);
		System.out.println("Sum of odd numbers between 1 to "+n+" is "+so);

	}

}

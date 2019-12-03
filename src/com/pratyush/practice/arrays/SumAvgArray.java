package com.pratyush.practice.arrays;

import java.util.Scanner;

public class SumAvgArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/* input */
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" ... Integers");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		/* sum */
		System.out.println("==============================");
		System.out.println("Sum of "+n+" Elements : ");
		System.out.println("==============================");
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
			System.out.println(i+1+"----------->"+ar[i]);
		}
		
		System.out.println("==============================");
		System.out.println("Sum is : "+sum);
		System.out.println("==============================");
		
		
		
		System.out.println("Average is : "+sum/(double)ar.length);
		
	}

}

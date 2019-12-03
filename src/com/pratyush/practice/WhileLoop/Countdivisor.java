package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class Countdivisor {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int  i=1,count=1;
		while (i<=n/2) {
			if(n%i==0)
				count ++;
			
			
			i++;
		}
		System.out.println("Number of divisior of "+n+" is "+count);
		 
	}

}

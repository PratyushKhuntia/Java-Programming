package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class Multipleof3s {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 
		System.out.println("Enter the value of n :");
		
		int n = sc.nextInt();
		int i=1;
		while(i<=n)
		{
			 if(i%3==0)
			 {
				System.out.println(i);
			 }
			 
			 i++;
		}

	}

}

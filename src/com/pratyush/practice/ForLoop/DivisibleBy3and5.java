package com.pratyush.practice.ForLoop;

import java.util.Scanner;

public class DivisibleBy3and5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		for(;m<=n;m++)
		{
			if(m%3==0)
				System.out.println("Fizz");
			else if(m%5==0)
				System.out.println("Buzz");
			else if(m%3==0 && m%5==0)
				System.out.println("Fizz and buzz");
			else
				System.out.println(m);
		}
	}

}

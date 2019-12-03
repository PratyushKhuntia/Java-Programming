package com.pratyush.practice.ForLoop;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int esum=0,osum=0;
		for(;m<=n;m++)
		{
			if(m%2==0)
				esum=esum+m;
			else
				osum=osum+m;
			
		}
		System.out.println("Sum of even number = "+esum);
		System.out.println("Sum of odd number = "+osum);

	}

}

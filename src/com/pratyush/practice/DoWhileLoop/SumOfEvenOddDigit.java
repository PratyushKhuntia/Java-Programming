package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class SumOfEvenOddDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  t=n,esum=0,osum=0;
		do {
			 
			int r=n%10;
			
			if(r%2==0)
				esum=esum+r;
			else
				osum=osum+r;
			
			n=n/10;
		   } while (n!=0);
		 
		System.out.println("Sum of even number of "+t+" digits  is "+esum);
		System.out.println("Sum of odd number of "+t+" digits  is "+osum);

	}

}

package com.pratyush.practice.DoWhileLoop;

import java.util.Scanner;

public class NumberOfEvenOddDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  t=n,ecount=1,ocount=1;
		do {
			 
			int r=n%10;
			
			if(r%2==0)
				
				ecount++;
			
			else
			
				ocount++;
			
			n=n/10;
		   } while (n!=0);
		 
		System.out.println("No of even digits in "+t+"  is "+ecount);
		System.out.println("No of odd digits in "+t+" is "+ocount);

	}

}

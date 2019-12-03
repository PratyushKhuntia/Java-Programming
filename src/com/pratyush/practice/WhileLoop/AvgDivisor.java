package com.pratyush.practice.WhileLoop;

import java.util.Scanner;

public class AvgDivisor {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  i=1,count=1,sum=n;
		while (i<=n/2) {
			if(n%i==0){
				count ++;
			sum=sum+i;
			 
			}
		   i++;
		   
		}
		 
		double avg=sum/count;
		System.out.println("Average of Divisor is "+avg);
		

}
}

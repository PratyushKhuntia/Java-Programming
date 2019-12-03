package com.pratyush.practice.Method;

import java.util.Scanner;

public class StrongBet_n_m {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number : ");
		int s = sc.nextInt();
		System.out.println("Enter Ending number : ");
		int e = sc.nextInt();
		for(int i=s;i<=e;i++) {
		boolean rs = isstrong(i);
				if(rs)
					System.out.println(i+" ");
				 
		}
	}
	
	static boolean isstrong(int n)
	{
		int sum=0,t=n;
		do {
			int r=n%10;
			 sum=sum+fact(r);
			 			 
			n=n/10;
		} while (n!=0);
		
		return sum==t;
	}
	static int fact(int n)
	{
		int f=1;
		while(n>1)
		{
			f=f*n;
			n--;
		}
		 return f;
	}


}

package com.pratyush.practice.Method;

import java.util.Scanner;

public class PerfectMatch {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		boolean rs=isperfect(n);
		if(rs)
			System.out.println(n+" is xperfect number");
		else
			System.out.println(n+" is not perfect number");
	}
	
	static boolean isperfect(int n)
	{
		int sum=0,i=1,t=n;
		while (i<=n/2) {
			if(n%i==0)
			sum=sum+i;
			i++;
				if(sum==t)
					return true;
		}
		return false;
	}

}

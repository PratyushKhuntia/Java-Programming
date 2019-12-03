package com.pratyush.practice.Method;

import java.util.Scanner;

public class ArmstrongM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		 boolean rs=isArmstrong(n);
		 if(rs)
			 System.out.println("Armstrong");
		 else
			 System.out.println("Not Armstrong");
	}
	
	static boolean isArmstrong(int n)
	{
		int sum=0,t=n;
		int c=countDigits(n);
		 
		do 
		{
			int r=n%10;
			sum=sum+pow(r,c);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}
	
	static int countDigits(int x)
	{
		int count=0;
		
		do
		{
			count++;
			x=x/10;
		 	
		}while(x!=0);
		return count;
	}
	
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}

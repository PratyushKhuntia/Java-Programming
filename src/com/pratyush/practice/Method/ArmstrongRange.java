package com.pratyush.practice.Method;

import java.util.Scanner;

public class ArmstrongRange {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting point :");
		int s=sc.nextInt();
		System.out.println("Enter Ending point :");
		int e=sc.nextInt();
		 
		 for(int i=s;i<=e;i++)
		 {
			 boolean rs=isArmstrong(i);
		 if(rs) {
			 
		     System.out.print(i+" ");
		 }
	     }
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

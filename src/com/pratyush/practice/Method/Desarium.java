package com.pratyush.practice.Method;

import java.util.Scanner;

public class Desarium {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		  
       
		 boolean rs=isDesarium(n);
		 if(rs)
			 System.out.println("Desarium");
		 else
			 System.out.println("Not Desarium");
	}
	
	static boolean isDesarium(int n)
	{
		int sum=0,t=n;
		String s = Integer.toString(n);  
        int len = s.length();
	 
		do 
		{
			int r=n%10;
			sum=sum+pow(r,len);
			 len--;
			
			n=n/10;
		}while(n!=0);
		return sum==t;
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

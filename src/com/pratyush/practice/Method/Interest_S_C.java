package com.pratyush.practice.Method;

import java.util.Scanner;

public class Interest_S_C {
	static void interest(double principal,double time,double rate)
	{
		double sim=(principal * time * rate)/100;
		  double com=principal * Math.pow(1.0+rate/100.0,time) - principal;
		    System.out.println("Simple Interest="+sim);
		    System.out. println("Compound Interest="+com);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the  Principal amount:");
		   double p = sc.nextDouble();
		    System. out. println("Enter the No.of years:");
		   double t = sc.nextDouble();
		    System. out. println("Enter the Rate of  interest");
		   double r = sc.nextDouble();
		  
		   interest(p,t,r);
	}

}

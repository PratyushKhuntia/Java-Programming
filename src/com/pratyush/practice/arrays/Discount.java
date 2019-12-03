 package com.pratyush.practice.arrays;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many product you hava");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter product price one by one ");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
			
		}
		 
		System.out.println("==============================");
		System.out.println("prod_no   price   dis   aftdisc ");
		System.out.println("==================================");
		double sum=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.print(i+1+"   "+ar[i]+"   ");
			if(ar[i]>99.99)
			{
				double dis=ar[i]*0.08;
				System.out.println(dis+"    "+(ar[i]-dis));
				sum=sum+(ar[i]-dis);
			}
			else
			{
				System.out.println("N/A"+"    "+ar[i]);
			sum=sum+ar[i];
			}
		}
		
		System.out.println("==============================");
		System.out.println("Total price : "+sum);
		System.out.println("==============================");
 }

}

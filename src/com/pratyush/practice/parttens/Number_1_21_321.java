package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Number_1_21_321 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//line
		{
			int k=n; 
	
			for(int j=n;j>i;j--)//elements
			{
				 
				System.out.print(j+"  ");
				 
			}
			System.out.println(" ");
		}
	}
}

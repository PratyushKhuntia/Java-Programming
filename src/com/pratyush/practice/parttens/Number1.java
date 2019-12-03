package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//lines  
		{
			int k=i;
			for(int j=1;j<=i;j++)//elements  
			{
				System.out.print(k+" ");
				k=k+n-j;
			  		 		 
			}
			System.out.println(" ");
		}
	}

}

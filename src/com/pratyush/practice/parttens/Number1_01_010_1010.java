package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Number1_01_010_1010 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)//line
		{
			 
	
			for(int j=0;j<i;j++)//elements
			{
				System.out.print(k%2+"  ");
				 k++;
			}
			System.out.println(" ");
		}
	}

}

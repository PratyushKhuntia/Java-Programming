package com.pratyush.practice.parttens;

import java.util.Scanner;

public class ABC_AB_A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)//line
		{
			for(int j=1;j<=i;j++)//elements
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println(" ");
		}
	}

}

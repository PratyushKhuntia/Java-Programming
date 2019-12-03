package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Partten4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)//line
		{
			for(int j=n;j>i;j--)//elements
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}


}

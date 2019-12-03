package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Partten1012 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int count=1;
		for(int i=0;i<n;i++)//line
		{
			for(int j=1;j<=n;j++)//elements
			{
				System.out.print(count%2+" ");
				count++;
			}
			System.out.println(" ");
		}
	}

}

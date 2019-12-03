package com.pratyush.practice.parttens;

import java.util.Scanner;

public class StarPartten1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//line
		{
			for(int j=1;j<=i;j++)//elements
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}

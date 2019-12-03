package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Number_123_451_234 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			  
			for(int j=0;j<n;j++)
			{
				System.out.print(k+"  ");
				if(k<9)
				 k++;
				else
					k=1;
			}
			System.out.println(" ");
		}
	}

}

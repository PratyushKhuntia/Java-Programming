package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Star_3_1_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sp=0,st=n;//sp starts from 0 and star stars from n
		for(int i=1;i<=n;i++)//line
		{
			 for(int j=1;j<=sp;j++)//  this is for blanks spaces
			{ 
				System.out.print(" ");
				 
			}
			
			for(int j=1;j<=st;j++)// this is for star
			{
				 
				System.out.print("*");
				 
			}
			if(i<=n/2)//this statement increase one space and decrease 2 stars
			{
				sp++;
				st=st-2;
			}
			else     //else decrease 1 spaces increase 2 stars
			{
				sp--;
				st=st+2;
			}
			System.out.println(" ");
		}

	}
}

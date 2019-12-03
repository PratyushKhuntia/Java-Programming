package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Num_1_212_212_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sp=n/2,st=1 ;
		for(int i=1;i<=n;i++)//line
		{
			
			 for(int j=1;j<=sp;j++)//  this is for blanks spaces
			{
				 
				System.out.print("  ");
				 
			}
			 int k=st/2+1;
			  
			for(int j=1;j<=st;j++)// this is for star
			{
				
				 
				System.out.print(k+" ");
				if(j<=st/2)
					k--;
				else
					k++;
				 
			}
			if(i<=n/2)//this statement decrease one space and increase 2 stars
			{
				sp--;
				st=st+2;
				
			}
			else     //else increase 1 spaces decrease 2 stars
			{
				sp++;
				st=st-2;
			
			}
			System.out.println(" ");
		}
	}

}

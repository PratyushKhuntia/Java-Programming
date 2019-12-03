package com.pratyush.practice.string;

import java.util.Scanner;

public class SumOfDigInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter athe String");
		String str=sc.nextLine();
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+ch-48;//in char 0 starts from 48.
				
				 
			}
		}
		System.out.println("Sum of digits present in the String is : "+sum);
		
		

	}

}

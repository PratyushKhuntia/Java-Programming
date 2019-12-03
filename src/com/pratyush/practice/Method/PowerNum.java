package com.pratyush.practice.Method;

import java.util.Scanner;

public class PowerNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int pw=pow(5,4);
		System.out.println(pw);
	}
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}

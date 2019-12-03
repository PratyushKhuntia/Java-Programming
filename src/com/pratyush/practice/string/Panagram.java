package com.pratyush.practice.string;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter athe String");
		String str=sc.nextLine();
		int count[]=new int[26];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90)
			{
				count[ch-65]++;
			}
			else if(ch>=97&&ch<=122)
			{
				count[ch-97]++;
			}
			 
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0) {
				System.out.println( "It is not a panagram");
			return;
			}
		}

		System.out.println("it is a panagram");
	}

}

package com.pratyush.practice.string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2=sc.nextLine();
	}
	
	private static boolean isAnagram(String str1,String str2)
	{
		int count1[]=new int[26];
		for (int i = 0; i < str1.length(); i++) 
		{
			char ch=str1.charAt(i);
			if(ch>=65&&ch<=90)
			{
				count1[ch-65]++;
			}
			else if(ch>=97&&ch<=122)
			{
				count1[ch-97]++;
			}
			 
		}
		int count2[]=new int[26];
		for (int i = 0; i < str2.length(); i++) 
		{
			char ch=str2.charAt(i);
			if(ch>=65&&ch<=90)
			{
				count2[ch-65]++;
			}
			else if(ch>=97&&ch<=122)
			{
				count2[ch-97]++;
			}
			 
		}
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}

}

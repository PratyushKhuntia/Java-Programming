package com.pratyush.practice.string;

import java.util.Scanner;

public class CountVCULS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter athe String");
		String str=sc.nextLine();
		
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
			{
				dc++;
				 
			}
			else {
				spc++;
			}
		}
System.out.println("Number of Vowels :"+vc);
System.out.println("Number of Consonants :"+cc);
System.out.println("Number of UpperCase :"+uc);
System.out.println("Number of LowerCase :"+lc);
System.out.println("Number of SpicialCharacter :"+spc);
	}

}

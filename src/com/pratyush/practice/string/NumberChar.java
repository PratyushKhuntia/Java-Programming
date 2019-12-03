package com.pratyush.practice.string;

import java.util.Scanner;

public class NumberChar {

	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		nw(n/10000000,"crore");
		nw(n/100000%100,"lakh");
		nw(n/1000%100,"thousand");
		nw(n/100%10,"hundred");
		nw(n%100,"");
		
	
	}
	static void nw(int n , String st)
	{
		String one[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eigthteen","Nineteen"};
		String two[]= {"","","twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(n<20)
			System.out.print(one[n]);
		else
			System.out.print(two[n/10]+one[n%10]);
		if(n!=0)
			System.out.print(st+" ");

	}
}

		
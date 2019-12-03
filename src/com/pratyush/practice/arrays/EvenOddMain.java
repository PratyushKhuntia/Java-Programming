package com.pratyush.practice.arrays;

public class EvenOddMain {

	public static void main(String[] args) {
		MyArray ma=new MyArray();
		int a[]=ma.readArr();
		int c[]=ma.countEO(a);
		System.out.println("Number of Even Numbers: "+c[0]);
		System.out.println("Number of Odd Numbers: "+c[1]);
		
		
	}
}

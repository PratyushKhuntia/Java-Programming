package com.pratyush.practice.arrays;

import java.util.Scanner;

public class MergeMain {
	public static void main(String[] args) {
		
		MyArray ma= new MyArray();
		System.out.println("Enter the first Array : ");
		int a[]=ma.readArr();
		
		System.out.println("Enter the second Array : ");
		int b[]=ma.readArr();
		
		System.out.println("Entered first Array : ");
		ma.dispArr(a);
		
		ma.dispArr(b);
		int c[]=ma.merge(a, b) ;
		System.out.println("After mearge : ");
		 ma.dispArr(c);
}
}

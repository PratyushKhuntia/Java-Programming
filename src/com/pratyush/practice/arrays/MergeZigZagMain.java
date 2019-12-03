package com.pratyush.practice.arrays;

public class MergeZigZagMain {
public static void main(String[] args) {
		
		ZigZag zg=new ZigZag();
		System.out.println("Enter the first Array : ");
		int a[]=zg.readArr();
		
		System.out.println("Enter the second Array : ");
		int b[]=zg.readArr();
		
		System.out.println("Entered first Array : ");
		zg.dispArr(a);
		
		System.out.println("Entered second Array : ");
		zg.dispArr(b);
		int c[]=zg.zigzag(a, b) ;
		System.out.print("After mearge : ");
		 zg.dispArr(c);
}

}

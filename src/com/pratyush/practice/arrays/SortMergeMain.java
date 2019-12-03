package com.pratyush.practice.arrays;

public class SortMergeMain {
public static void main(String[] args) {
		
	  ArrSortMerge sm = new ArrSortMerge();
		System.out.println("Enter the first Array : ");
		int a[]=sm.readArr();
		
		System.out.println("Enter the second Array : ");
		int b[]=sm.readArr();
		
		System.out.println("Entered first Array : ");
		sm.dispArr(a);
		
		System.out.println("Entered second Array : ");
		sm.dispArr(b);
		int c[]=sm.sortMer(a, b) ;
		System.out.print("After mearge : ");
		 sm.dispArr(c);
}

}

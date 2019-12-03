package com.pratyush.practice.parttens;

import java.util.Scanner;

public class NumStarNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
				if(i>j)
					System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}

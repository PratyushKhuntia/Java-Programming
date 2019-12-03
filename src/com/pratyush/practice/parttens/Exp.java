package com.pratyush.practice.parttens;

import java.util.Scanner;

public class Exp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		 int k=1;
		for (int i=n; i>=1; i--) {
			for (int j = 1; j <=n; j++) {
				System.out.print(j+" ");
				if(k<9)
					k++;
				else
					k=1;
				 
				
			}
			System.out.println();
			
		}
	}

}

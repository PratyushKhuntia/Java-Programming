package com.pratyush.practice.twoDArray;

public class MatrixMain {
	public static void main(String[] args) {
		Matrix mt = new Matrix();
		System.out.println("Enter first matrix");
		int a[][]=mt.readMat();
		System.out.println("Enter second matrix");
		int b[][]=mt.readMat();
		
		System.out.println("Entered first matrix");
		 mt.dispMat(a);;
		System.out.println("Entered second matrix");
		 mt.dispMat(b);
		 
		 int c[][]=mt.addMat(a, b);
		 
		 if(c==null)
			 System.out.println("Addition failed");
		 else
		 {
			 System.out.println("added matrix: ");
			 mt.dispMat(c);
		 }
	}

}

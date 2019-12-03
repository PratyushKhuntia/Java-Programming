package com.pratyush.practice.twoDArray;

public class MainMat {
	public static void main(String[] args) {
		int mat[][];//declaration
		mat=new int[][] {{3,4,5},{5,6,7,8},{8,9}}; //initialisation
		System.out.println(mat);//[[
		System.out.println(mat[1]);//[
		System.out.println("number of rows"+mat.length);
		System.out.println("number of elements in 1st row"+mat[0].length);
		System.out.println("number of element in second row"+mat[1].length);
		System.out.println("number of elements in last row"+mat[mat.length-1].length);
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}

package com.pratyush.practice.twoDArray;

import java.util.Scanner;

public class Matrix {
	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and number of columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter the "+r*c+" Elements row wise");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	void dispMat(int mat[][])
	{
		System.out.println("Entered array elements are");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

	public int[][] addMat(int[][] x,int[][] y)
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
			return null;
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
	
	public int biggestMat(int[][] mat)
	{
		int big=mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
	}
	
	int[][] transpose(int x[][])
	{
		int t[][]=new int[x[0].length][x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				t[i][j]=x[j][i];
			}
		}
		return t;
	}
	
	void rowWiseRev(int x[][])
	{
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length/2; j++) {
				int t=x[i][j];
				x[i][j]=x[i][x[i].length-1-j];
				x[i][x[i].length-1-j]=t;
			}
		}
	}
	
	void columnWiseRev(int x[][])
	{
		for (int i = 0; i < x.length/2; i++) {
			for (int j = 0; j < x[i].length; j++) {
				int t=x[i][j];
				x[i][j]=x[x.length-1-i][j];
				x[x.length-1-i][j]=t;
			}
		}
	}
	
	int[][] rotate90Left(int a[][])
	{
		a=transpose(a);
		columnWiseRev(a);
		return a;
	}
	
	int[][] rotate90Right(int a[][])
	{
		a=transpose(a);
		rowWiseRev(a);
		return a;
	}
	
	
	
	void revDigonal(int a[][])
	{
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
				{
					int t=a[i][j];
					a[i][j]=a[a.length-1-i][a.length-1-j];
					a[a.length-1-i][a.length-1-j]=t;
					
				}
				if(i+j==a.length-1)
				{
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
	}
	
	int[] rowWiseSum(int x[][])
	{
		int sum[]=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				sum[i]=sum[i]+x[i][j];
			}
		}
		return sum;
	}
	
	int[] columnWiseSum(int x[][])
	{
		int sum[]=new int[x.length];
		for (int i = 0; i < x[0].length; i++) {
			for (int j = 0; j < x.length; j++) {
				sum[i]=sum[i]+x[j][i];
			}
		}
		return sum;
	}
	
	
	int[] rowWiseBig(int x[][])
	{
		int big[]=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			big[i]=x[i][0];
			for (int j = 1; j < x[i].length; j++) {
				if(big[i]<x[i][j])
					big[i]=x[i][j];
			}
		}
		return big;
	}
	
	
	int[] columnWiseBig(int x[][])
	{
		int big[]=new int[x.length];
		for (int i = 0; i < x[0].length; i++) {
			big[i]=x[0][i];
			for (int j = 1; j < x.length; j++) {
				if(big[i]<x[j][i])
					big[i]=x[j][i];
			}
		}
		return big;
	}
	
	
	                                                                                                              
}



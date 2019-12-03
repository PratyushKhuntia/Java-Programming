package com.pratyush.practice.randomNumber;

import java.util.Scanner;
import java.util.Random;

class GuessGame
{
	public static void main(String arg[])
	{
		Random rd=new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess the number between :" );
		int un = sc.nextInt();
		int rn=rd.nextInt(10);
		if(un==rn)
		System.out.println("Congrats you won the game");
		else
		System.out.println("Sorry it was "+rn);
		 
	}
}
package com.pratyush.practice.WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd =new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr first playername :");
		String fname=sc.next();
		System.out.println("Enetr Second playername :");
		String sname=sc.next();
		int ftotal=0,stotal=0;
		while(true)
		{
			System.out.println(fname+"press any key and enter button to flip the dice");
			sc.next();
			int fn=rd.nextInt(6)+1;
			System.out.println("You scored:"+fn);
			
			if(ftotal+fn<=100)
				ftotal=ftotal+fn;
			if(ftotal==100)
			{
				System.out.println("Congrats!"+fname+"you won the match");
				break;
			}
			else
				System.out.println(fname+"total score"+ftotal);
			
			System.out.println("-----------------------------------------------");
			
			System.out.println(fname+"press any key and enter button to flip the dice");
			sc.next();
			int sn=rd.nextInt(6)+1;
			System.out.println("You scored:"+sn);
			
			if(stotal+sn<=100)
				stotal=stotal+sn;
			if(stotal==100)
			{
				System.out.println("Congrats! "+sname+" you won the match");
				break;
			}
			else
				System.out.println(sname+" total score "+stotal);
			
			System.out.println("-----------------------------------------------");
		}
		

	}

}

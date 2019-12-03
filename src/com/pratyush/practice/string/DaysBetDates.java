package com.pratyush.practice.string;

public class DaysBetDates {
	public static void main(String[] args) {
		Date d1=new Date(1,1,1);
		Date d2=new Date(15,8,2019);
		System.out.println(d2.noOfDays()-d1.noOfDays());
		System.out.println(d1.dayName());
		System.out.println(d2.dayName());
	}

}

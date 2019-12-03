package com.pratyush.practice.string;

public class Date {
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
	}
	public int noOfDays()
	{
		int y=yy-1;
		int days=y*365;
		days=days+y/400+y/4-y/100;
		for (int i = 0; i < mm; i++) {
			days=days+month[i];
		}
		return days+dd;
	}
	
	String dayName()
	{
		String st[]= {"Sunday","Monday","Tuesday","wednesday","Thruesday","Friday","Satureday"};
		return st[noOfDays()%7];
	}

}

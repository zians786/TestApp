package com.bridgeit.testApp.Programs;

import com.bridgeit.testApp.Utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
	//	int month=Integer.parseInt(args[0]),day=Integer.parseInt(args[1]),year=Integer.parseInt(args[2]);
		int month=10,day=6,year=2017;
		Utility utility=new Utility();
		int date=utility.dayOfWeek(month, day, year);
		String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println("At this date Day was '"+days[date]+"' ");
	}

}

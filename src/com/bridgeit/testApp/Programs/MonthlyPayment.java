package com.bridgeit.testApp.Programs;
import java.util.*;

import com.bridgeit.testApp.Utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Principal Amount, Number Of Year and Rate of Interest..");
		double principal=scanner.nextDouble();
		double year=scanner.nextDouble();
		double rate=scanner.nextDouble();
		Utility utility=new Utility();
		utility.monthlyPayment(principal,year,rate);
	}

}

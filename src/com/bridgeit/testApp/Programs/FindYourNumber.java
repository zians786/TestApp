package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class FindYourNumber {

	public static void main(String args[]) {
	//	int n=Integer.parseInt(args[0]);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N=scan.nextInt();
		
		
		
		Utility util=new Utility();
		util.findYourNumber(N);
		
	}

}

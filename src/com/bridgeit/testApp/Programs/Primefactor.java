package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class Primefactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter Number to Find to Prime Factor");
		int number=scanner.nextInt();
		utility.primeFactors(number);
	}

}

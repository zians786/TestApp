package com.bridgeit.testApp.Programs;

import java.util.Arrays;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

import com.bridgeit.testApp.Utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		String value="";
		System.out.println("Enter Decimal Number..");
		int number=scanner.nextInt();
		System.out.println("Binary Representation of Decimal --> "+utility.decimalToBinary(number));
		}
	}



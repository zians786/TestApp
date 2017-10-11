package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Decimal Number..");
		int number=scanner.nextInt();
		String value=utility.decimalToBinary(number);
		System.out.println("Binary Representation of Decimal --> "+value);
		String[] swap=new String[value.length()/4];
		for(int i=0,j=0;i<value.length();i=i+4){
			swap[j++]=value.substring(i,i+4);
		}
		String resultswap="";
		for(int i=swap.length-1;i>=0;i--){
			resultswap+=swap[i];
		}
		System.out.println("Swap Binary Representation is --> "+resultswap);
		int decimalValue=utility.binaryToDecimal(resultswap);
		System.out.println("And Decimal Value is.. "+decimalValue);
		}

	}


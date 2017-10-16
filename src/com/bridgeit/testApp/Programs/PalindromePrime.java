package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class PalindromePrime {

	public static void main(String[] args) {
		Utility util = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Range Of Prime Number from 0 to...");
		int range = scanner.nextInt();
		int[] values = new int[range - 1];
		for (int i = 0; i < range - 1; i++) {
			values[i] = i;
		}
		int[] prime = util.prime(values);
	
		String str = "";
		for (int i = 0; i < prime.length; i++) {
			str = str + Integer.toString(prime[i]) + " ";
		}
		System.out.println(str.toString());
		String[] strArray = str.split(" ");
		
		String foranagram="";
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (util.anagram(strArray[i], strArray[j])) {
					if (strArray[i].equals(strArray[j])) {

					} else {
						System.out.print(" " + strArray[i] + " " + strArray[j]);
						foranagram+=strArray[i]+" ";
						foranagram+=strArray[j];
					}
				}
			}
		}
		
		String[] anagramString = str.split(" ");
		int anagramArray[]=new int[anagramString.length];
		for(int i=0;i<anagramString.length;i++){
			anagramArray[i]=Integer.parseInt(anagramString[i]);
		}
		
		System.out.println();
		System.out.println("Palindrome After Finding prime and anagram..");
		
		int[] palindrome=util.palindrome(anagramArray);
		
		for(int x:palindrome){
			System.out.println(x);
		}
	}

}

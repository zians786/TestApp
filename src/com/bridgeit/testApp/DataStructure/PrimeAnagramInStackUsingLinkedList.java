package com.bridgeit.testApp.DataStructure;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class PrimeAnagramInStackUsingLinkedList {

	public static void main(String[] args) {
		Utility util = new Utility();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The Range Of Prime Number from 0 to...");
		int range=scanner.nextInt();
		int[] values = new int[range - 1];
		for (int i = 0; i < range - 1; i++) {
			values[i] = i;
		}
		int[] prime = util.prime(values);
		int[] anagram=util.anagram(prime);
		for(int x:anagram){
			System.out.println(x);
		}

	}

}

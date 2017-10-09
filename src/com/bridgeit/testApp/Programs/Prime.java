
package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.*;

public class Prime {

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
		for (int j : prime) {
			System.out.println(j);
		}
		/*
		 * int counter = 0, number = 2; while (counter < 1000) { if
		 * (checkPrime(number)) { System.out.println(number); } counter++;
		 * number++; }
		 */
	}

	public static boolean checkPrime(int number) {
		int m = number / 2;
		for (int i = 2; i <= m; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}

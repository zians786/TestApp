package com.bridgeit.testApp.Programs;

import com.bridgeit.testApp.Utility.Utility;

public class PalindromePrime {

	public static void main(String[] args) {

		Utility util = new Utility();

		int counter = 0, number = 2;
		while (counter < 1000) {
			if (util.checkPrime(number)) {
				if (util.checkPalindrome(number)) {
					System.out.println(number);
				}

			}
			counter++;
			number++;
		}

	}

}

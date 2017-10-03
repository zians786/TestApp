
package com.bridgeit.testApp.Programs;

import com.bridgeit.testApp.Utility.*;

public class Prime {

	public static void main(String[] args) {
		Utility util = new Utility();

		int counter = 0, number = 2;
		while (counter < 1000) {
			if (util.checkPrime(number)) {
				System.out.println(number);
			}
			counter++;
			number++;
		}

	}

}

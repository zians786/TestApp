package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class PrintWriter2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("for Integers...");
		Object[][] integer = { { 1, 2, 3 }, { 4, 5, 6 } };
		utility.generic2DArrayDisplay(integer);
		System.out.println();

		System.out.println("for Integers...");
		String[][] string = { { "hi", "friends" }, { "nice", "day" } };
		utility.generic2DArrayDisplay(string);
		System.out.println();

		System.out.println("for Characters...");
		Character[][] character = { { 'h', 'i' }, { 'b', 'y' } };
		utility.generic2DArrayDisplay(character);
	}

}

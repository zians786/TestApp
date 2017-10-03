package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Elements in..");
		int N = scan.nextInt();

		System.out.println("Enter value which you want to Find");
		int find = scan.nextInt();

		int[] a = new int[N];
		for (int i = 1; i < N; i++) {
			a[i] = i;
		}
		Utility util = new Utility();
		find = util.binarySearch(find, a);
		System.out.println("Found at Index " + find+" "+a[find]);
		scan.close();
	}

}

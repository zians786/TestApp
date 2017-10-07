package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class BinarySearch_Integer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Elements in..");
		int n = scan.nextInt();

		System.out.println("Enter value which you want to Find");
		Integer find = scan.nextInt();

		Integer[] array = new Integer[n];
		for (int i = 1; i < n; i++) {
			array[i] = i;
		}
		Utility util = new Utility();
		
		find = util.binarySearch(find, array);
		if(find==-1){
			System.out.println("Number not Found");
		}
		else
		System.out.println("Found at Index " + find+" And Element is "+array[find]);
		scan.close();
	}

}

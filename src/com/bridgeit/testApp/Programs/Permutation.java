package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter String");
		String pattern=scanner.nextLine();
		int lastIndex=pattern.length()-1;
		int firstIndex=0;
		
		utility.permutation(pattern,firstIndex,lastIndex);
		
		
	
		
	}

}

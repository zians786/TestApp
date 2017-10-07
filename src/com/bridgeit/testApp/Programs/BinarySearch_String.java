package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class BinarySearch_String {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		Utility utility=new Utility();
		String[] name={"Zian","Ajit","Imran","Faisal"};
		utility.bubbleSort(name);
		System.out.println("Enter String You want to find..");
		String find=scanner.nextLine();
		int position=utility.binarySearch(find, name);
		if(position==-1)
		{
			System.out.println("String Not Found");
		}
		else
		{
			System.out.println(name[position]+" Found at Index "+position);
		}
		
	}
}

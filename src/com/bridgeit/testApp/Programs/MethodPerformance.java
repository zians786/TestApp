package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class MethodPerformance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] performance=new double[6];
		System.out.println("Binary Search for Integer-->\nEnter Number of Elements in..");
		int n = scan.nextInt();

		System.out.println("Enter value which you want to Find");
		Integer find = scan.nextInt();

		Integer[] array = new Integer[n];
		for (int i = 1; i < n; i++) {
			array[i] = i;
		}
		Utility util = new Utility();
		double start=util.startWatch();
		find = util.binarySearch(find, array);
		double binaryIntegerPerformance=util.elapseTime(start);
		performance[0]=binaryIntegerPerformance;
		if(find==-1){
			System.out.println("Number not Found");
		}
		else
		System.out.println("Found at Index " + find+" And Element is "+array[find]);
		System.out.println("Performance time is"+binaryIntegerPerformance);
		
		
		
		String[] name={"Zian","Ajit","Imran","Faisal"};
		util.bubbleSort(name);
		for(String s:name){
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Enter String You want to find..");
		scan.nextLine();
		String findString=scan.nextLine();
		
		double startBinaryString=util.startWatch();
		int position=util.binarySearch(findString, name);
		double binaryStringPerformance=util.elapseTime(startBinaryString);
		performance[1]=binaryStringPerformance;
		if(position==-1)
		{
			System.out.println("String Not Found");
		}
		else
		{
			System.out.println(name[position]+" Found at Index "+position);
		}
		System.out.println("Performance time is"+binaryStringPerformance);
		System.out.println("Bubble sort-->");
		Integer[] integerArray={5,2,6,3,4};
		for(Integer s:integerArray){
			System.out.print(s+" ");
		}
		System.out.println("After Sorting..");
		double bubbleInteger=util.startWatch();
		util.bubbleSort(integerArray);
		double bubbleIntPerformance=util.elapseTime(bubbleInteger);
		for(Integer s:integerArray){
			System.out.print(s+" ");
		}
		System.out.println("Performance time is"+bubbleIntPerformance);
		
		
		String[] values={"Hello","Bye","Friends","Good"};
		for(String s:values){
			System.out.print(s+" ");
		}
		System.out.println("After Sorting..");
		double bubbleString=util.startWatch();
		util.bubbleSort(values);
		double bubbleStringPerformance=util.elapseTime(bubbleInteger);
		for(String s:values){
			System.out.print(s+" ");
		}

		System.out.println("Performance time is"+bubbleStringPerformance);
	
		System.out.println("***** Insertion Sort *****");
		Integer[] insertionArray={14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		 double insertionStart=util.startWatch();
		util.insertionSort(insertionArray);
		double insertionIntPerformance=util.elapseTime(insertionStart);
		for(Integer s:insertionArray){
			System.out.print(s+" ");
		}System.out.println();
		System.out.println("Performance time is"+insertionIntPerformance);
		
		
		
		String[] insertionString={"Hello","Bye","Friends","Good","Nice","Awesome","Excellent"};
		for(String s:values){
			System.out.print(s+" ");
		}System.out.println();
		System.out.println("After Sorting..");
		double insertionString1=util.startWatch();
		util.bubbleSort(insertionString);
		double insertionStringPerformance=util.elapseTime(insertionString1);
		for(String s:insertionString){
			System.out.print(s+" ");
		}

		System.out.println("Performance time is"+insertionStringPerformance);

	}

}

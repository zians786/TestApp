package com.bridgeit.testApp.Programs;

import com.bridgeit.testApp.Utility.Utility;

public class InsertionSort_Integer {
	public static void main(String arg[]){
		
		Integer[] array={5,2,6,3,4};
		Utility util =new Utility(); 
		array=util.insertionSort(array);
		for(Integer x:array ){
			System.out.println(x);
		}
		
	}

}

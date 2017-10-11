package com.bridgeit.testApp.DataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bridgeit.testApp.Utility.LinkedListUtility;
import com.bridgeit.testApp.Utility.Utility;

public class HashFunction {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		LinkedListUtility utility = new LinkedListUtility();
		Utility util = new Utility();
		File file = new File("/root/workspace/TestApp/src/com/bridgeit/testApp/DataStructure/Number.txt");

		if (file.exists()) {
			if (file.canRead()) {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				String data = bufferedReader.readLine();
				String[] word = data.trim().split(",");
				int[] number=new int[word.length];
				int array[]=new int[11];
				Map<Integer,> map=new HashMap<>();
				for(int i=0;i<array.length;i++){
					int slot=number[i];
					slot=slot/11;
					if(array[slot]==0){
						array[slot]=number[i];
					}
					else{
						
					}
				}
				
				
				
			} else {
				System.out.println("File Can not be read..");
			}

		} else {
			System.out.println("File not Exist..");
		}
	}
}
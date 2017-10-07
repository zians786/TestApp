package com.bridgeit.testApp.Programs;

import java.io.*;
import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class WordListSearch {
	public static void main(String args[]) throws IOException{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		String data="";
		File file=new File("/root/workspace/TestApp/src/com/bridgeit/testApp/Programs/text.txt");
		if(file.exists()){
			if(file.canRead()){
				BufferedReader bufferedreader=new BufferedReader(new FileReader(file));
				data=bufferedreader.readLine();
				String[] string=data.split(",");
				
				for(String s:string){
					System.out.println(s);
				}
				
				System.out.println("Enter Word you want to find");
				String word=scanner.nextLine();
				utility.bubbleSort(string);
				if(utility.binarySearch(word, string)!=-1){
					System.out.println("Word "+word+" Found...");
				}
				else{
					System.out.println("Word "+word+" Not Found...");
				}
				
				
			}else{
				System.out.println("File cannt read,......");
			}
				
		}
		else{
			System.out.println("File Not Exist");
		}
	}
}	

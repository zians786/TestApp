package com.bridgeit.testApp.Programs;

import java.io.*;

public class WordListSearch {
	public static void main(String args[]){
		String data="";
		File file=new File("/home/bridgeit/zian_workspace/TestApp/src/com/bridgeit/testApp/Programs/text.txt");
		if(file.exists()){
			if(file.canRead()){
				BufferedReader buffer=new BufferedReader(new FileReader(file));
			}else{
				System.out.println("File cannt read,......");
			}
				
		}
		else{
			System.out.println("File Not Exist");
		}
	}
}	

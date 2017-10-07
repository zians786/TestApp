package com.bridgeit.testApp.Programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;


public class Anagram {
    public static void main(String aa[])
    {
        Scanner scan=new Scanner(System.in);
        String first_string="";
        String second_string="";
        System.out.println("Enter Two Strings to check Anagram-->");
        first_string=scan.nextLine();
        second_string=scan.nextLine();
        checkAnagram(first_string,second_string);
        
    }
    
    public static void checkAnagram(String first,String second){
        char[] copyOfFirst=first.toLowerCase().toCharArray();
        char[] copyOfSecond=second.toLowerCase().toCharArray();
        
        Character[] char1=new Character[copyOfFirst.length];
        for(int i=0;i<copyOfFirst.length;i++){
        	char1[i]=copyOfFirst[i];
        }

        Character[] char2=new Character[copyOfSecond.length];
        for(int i=0;i<copyOfSecond.length;i++){
        	char2[i]=copyOfSecond[i];
        }

        Utility utility=new Utility();
        utility.bubbleSort(char1);
        utility.bubbleSort(char2);
      //  Arrays.sort(copyOfFirst);
       // Arrays.sort(copyOfSecond);
        
        if(Arrays.equals(char1, char2))
        {
             System.out.println("Given Two Strings '"+first+"' '"+second+"' are Anagram..");
        }
        else
            System.out.println("Given Two Strings '"+first+"' '"+second+"' are Not Anagram..");
    }
}
 

package com.bridgelabz.programs;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Anagram {
  public static void main(String[] args) {
	  Utility utility=new Utility();
	  
	//provide input anagram logic and call the methodsof anagram
	 //read 2 string
	  System.out.println("Enter the First string");
	  String str1=utility.getString();
	  System.out.println("Enter the second String");
	  String str2=utility.getString();
	  utility.checkAnagarm(str1, str2);
	
	
}

}

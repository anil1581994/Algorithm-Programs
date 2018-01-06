package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BubbleSortIS {
public static void main(String[] args) {
  Utility utility=new Utility();	
  System.out.println("Enter the size of array");
  int n=utility.getInteger();
  int a[]=new int [n];
  System.out.println("Enter the Element in array");
  for(int i=0;i<a.length;i++)
	  a[i]=utility.getInteger();
  
	 System.out.println("Sorted Integers Elements are........");
	 utility.bubbleSort1(a);
	 
	 String str[]=new String[n];
	 System.out.println("Enter the String Elements.....");
	 for(int i=0;i<n;i++)
	 str[i]=utility.getString();
	 
	 System.out.println("enter the string array");

	 utility.bubbleSort2(str);
	
  
}//main
}//cls

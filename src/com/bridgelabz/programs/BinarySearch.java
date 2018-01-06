package com.bridgelabz.programs;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearch {
	    
	  
		 public static void main(String args[]){  
			 Utility utility=new Utility();
			
				System.out.println("Enter the Size of the Array.......");
				 int n=utility.getInteger();

				Integer a[]=new Integer[n]; 
				
			
				String[] str=new String[n];
			
				System.out.println("Enter the String Elements.........");
				for(int i=0;i<n;i++)
				str[i]=utility.getString();
			
				for(int i=0;i<n;i++)
				System.out.println(str[i]);
				String key2;
				System.out.println("Enter the String to Search.....");
				key2=utility.getString();
			
				if(utility.binarySearch(str,key2,0,a.length-1)!=0)
				System.out.println("The Element is found......");
				else System.out.println("The Element Not Found......");
				
			
		 } 
}

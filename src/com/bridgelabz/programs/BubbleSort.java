package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
public static void main(String[] args) {
	Utility utility = new Utility();

	System.out.println("Enter the Size of the IntArray....");
	int n = utility.getInteger();

	int a[] = new int[n];

	System.out.println("Enter the Intger Elements.....");
	for (int i = 0; i < n; i++)
		a[i] = utility.getInteger();

	System.out.println("Sorted Integers Elements are........");
	 utility.bubbleSort1(a);
	 System.out.println(" ");
	 System.out.println("----------------------------------");
	 System.out.println("enter the size for String Array");
	 int n1 = utility.getInteger();
	 String str[]=new String[n1];
	 System.out.println("Enter the String Element ");
	 for(int i=0;i<n1;i++)
		 str[i]=utility.getString();
	 System.out.println("Sorted String Elements are........");
	 utility.bubbleSort2(str);
	 
	 
	 
}
}

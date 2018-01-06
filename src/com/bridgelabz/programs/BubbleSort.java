package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
public static void main(String[] args) {
	Utility utility = new Utility();

	System.out.println("Enter the Size of the Array....");
	int n = utility.getInteger();

	int a[] = new int[n];

	System.out.println("Enter the Array Elements.....");
	for (int i = 0; i < n; i++)
		a[i] = utility.getInteger();

	System.out.println("Sorted Integers Elements are........");
	 utility.bubbleSort1(a);
	 
}
}

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
public static void main(String[] args) {
	Utility utility=new Utility();

	System.out.println("Enter the Size of the Array....");
	int n = utility.getInteger();

	
	String str[] = new String[n];
	System.out.println("Enter the String Elements.....");
	for (int i = 0; i < n; i++)
		str[i] = utility.getString();

	System.out.println("Sorted String Elements are........");
	utility.insertionSort(str);
	utility.display(str);

}
}

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
public static void main(String[] args) {
	Utility utility=new Utility();

	System.out.println("Enter the Size of the IntArray....");
	int n = utility.getInteger();
	Integer a[]=new Integer[n];
	System.out.println("Enter the elemment array");
	for(int i=0;i<n;i++)
	a[i]=utility.getInteger();
	System.out.println("Sorted Integer Elements are........");
	utility.insertionSort(a);
	utility.display(a);


	System.out.println("Enter the Size of the StringArray....");
	int n1 = utility.getInteger();
	String str[] = new String[n1];
	System.out.println("Enter the String Elements.....");
	for (int i = 0; i < n; i++)
		str[i] = utility.getString();

	System.out.println("Sorted String Elements are........");
	utility.insertionSort(str);
	utility.display(str);

}
}

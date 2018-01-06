package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class InsertionSortIS {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter the Size of the Array....");
		int n = utility.getInteger();

		Integer a[] = new Integer[n];

		System.out.println("Enter the Array Elements.....");
		for (int i = 0; i < n; i++)
			a[i] = utility.getInteger();

		System.out.println("Sorted Integers Elements are........");
		utility.insertionSort(a);

		utility.display(a);

		String str[] = new String[n];
		System.out.println("Enter the String Elements.....");
		for (int i = 0; i < n; i++)
			str[i] = utility.getString();

		System.out.println("Sorted String Elements are........");
		utility.insertionSort(str);
		utility.display(str);

	}

}

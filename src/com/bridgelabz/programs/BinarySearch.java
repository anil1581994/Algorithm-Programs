package com.bridgelabz.programs;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearch {

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("------Integer**Search-------");
		System.out.println("Enter the Size of the IntArray.......");
		int n = utility.getInteger();
		Integer a[] = new Integer[n];
		System.out.println("Enter the  Elements in array.....");

		for (int i = 0; i < n; i++)
			a[i] = utility.getInteger();
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
		Integer key1;
		System.out.println("Enter the integer to Search.....");
		key1 = utility.getInteger();
		
		if (utility.binarySearch(a, key1, 0, a.length - 1) != 0)
			System.out.println("The Element is found......");
		else
			System.out.println("The Element Not Found......");
		
		System.out.println("------String**Search-------");
		
		System.out.println("Enter the Size of string array ......");
		
		int n2 = utility.getInteger();
		String[] str = new String[n2];

		System.out.println("Enter the String Elements.........");
		for (int i = 0; i < n2; i++)
			str[i] = utility.getString();

		for (int i = 0; i < n2; i++)
			System.out.println(str[i]);
		String key2;
		System.out.println("Enter the String to Search.....");
		key2 = utility.getString();

		if (utility.binarySearch(str, key2, 0, a.length - 1) != 0)
			System.out.println("The Element is found......");
		else
			System.out.println("The Element Not Found......");

	}
}

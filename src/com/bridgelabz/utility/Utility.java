/**
s * discription:Algoirthm Program  
 * Date:06/01/2018  8:30
 * Author:Anil Rajes Patil 
 * 
 * **/

package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.next();
	}

	public int getInteger() {
		return scanner.nextInt();
	}

	public double getDouble() {
		return scanner.nextDouble();
	}

	public boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public float getFloat() {
		return scanner.nextFloat();
	}

	/*
	 * @param string1
	 * 
	 * @param string2
	 * 
	 * @logic to find two string are anagram or not
	 */
	public static void checkAnagarm(String str1, String str2) {

		boolean status = false;
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			System.out.println("string are not anagram");
		} else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			// sort array
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);

		}
		if (status) {
			System.out.println("yes,strings are anagram");
		} else {
			System.out.println("No the strings are not anagram");
		}

	}
	/*
	 * @take range (0-1000)
	 * 
	 * @logic to find prime number
	 * 
	 * 
	 */

	String primeNumbers = "";

	public void findPrime(int n) {
		for (int i = 0; i <= n; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}

			} // in for
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		} // out for
		System.out.println("Prime numbers from 1 to 1000 are :");
		System.out.println(primeNumbers);

	}

	// Binarys serarch for finding spec Q4 nqd Q6
	public static <T extends Comparable> int binarySearch(T[] str, T key2, int start, int end) {

		if (start > end)
			return 0;

		int mid = (start + end) / 2;

		if (str[mid].equals(key2))//string
			return mid;

		else if ((str[mid]).compareTo(key2) > 0)

			return binarySearch(str, key2, start, mid - 1);

		else
			return binarySearch(str, key2, mid + 1, end);

	}

	// insertion sort..Q4 and Q7
	public static <T extends Comparable> T[] insertionSort(T[] elements) {

		int i, hole;

		for (i = 1; i < elements.length; i++) 
		{
			T key = elements[i];
			hole = i;

			while (hole > 0 && elements[hole - 1].compareTo(key) > 0) {
				elements[hole] = elements[hole - 1];
				hole--;
			}
			elements[hole] = key;
		}

		return elements;
	}

	public static <T> void display(T[] values) {
		for (int i = 0; i < values.length; i++)

			System.out.println(values[i] + " ");
	}

	// bubble sort..Integer7

	public void bubbleSort1(int[] a) {

		System.out.println("array before sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println(" sorted the array using Bubble sort");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("array after sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}

	}

	// bubble sort for string and file option-1 also Q6
	String tempStr;

	public void bubbleSort2(String str[]) {

		for (int t = 0; t < str.length - 1; t++) {
			for (int i = 0; i < str.length - t - 1; i++) {
				if (str[i + 1].compareTo(str[i]) < 0) {
					tempStr = str[i];
					str[i] = str[i + 1];
					str[i + 1] = tempStr;
				}
			}
		}

		for (String s1 : str) // for each loop
		{
			System.out.print(s1+"\t");
		}
	}

	// Question to findNumber

	public static int search(int low, int high)
	{
		Scanner scanner = new Scanner(System.in);
		if ((high - low) == 1)
			return low;
		int mid = low + (high - low) / 2;
		System.out.printf("Is it less than ", mid);
		System.out.println();
		System.out.println("Enter the true or false to find your number");
		boolean b = scanner.nextBoolean();// depends upon select true/false
		if (b)
			return search(low, mid);
		else
			return search(mid, high);
	}

	// temp conversion
	public static float temperaturConversion(float temperatur, String check) {
		if (check == "c") {
			return (temperatur - 32f) * (5f / 9f);
		} else {
			return (temperatur * (9f / 5f)) + 32f;
		}
	}

	// Vending Machine calculate number notes in guven amount
	static int i = 0;
	static int total = 0;

	public static int vendingMachineCal(int money, int notes[]) {
		int rem = 0;
		if (money == 0) {
			return -1;
		} else {
			if (money >= notes[i]) {
				// logic to calculate notes
				int calnotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total = total + calnotes;
				System.out.println(notes[i] + "notes--->" + calnotes);

			}
		}
		i++;
		return vendingMachineCal(money, notes);

	}

	// find day of week
	public static void dayOfWeek(int month, int day, int year) {
		// String months[]
		// ={"","January","February","march","April","may","June","July","August","september","October","November","December"};
		if (month < 1 || month > 12) {
			System.out.println("Month is Invalid.....");
			System.exit(0);
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}

		if (month == 2) {
			if (day > 29 && year % 4 != 0) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}

		String[] days = { "Sunday", "Monday", "Tuesday", "Wensday", "Thursday", "Friday", "Saturday" };
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;

		System.out.print(d + " for " + days[d]);
	}

	// payment

	public static void monthlyPayment(int principalLoan, int years, double interest) {
		int n = 12 * years;
		double result = interest / (12 * 100);

		double monthlyPayment = (principalLoan * result) / (1 - Math.pow(1 + result, (-n)));

		System.out.println("The output is...." + monthlyPayment);
	}
	// sqrt

	public static void sqrt(double number) {
		double epsilon = 1e-15;
		double t = number;// t<--number<--c
		while (Math.abs(t - number / t) > epsilon * t) {
			// repeatedly apply Newton update step until desired precision is achieved

			t = (number / t + t) / 2.0;// replace t with c/t and t
		}

		System.out.println("The Result is........" + t);
	}
	// Decimal to Binary COnversion 15,16

	public static String toBinary(int decimal) {
		String binary = "";// to store binary num
		while (decimal > 0) {
			binary = decimal % 2 + binary;// append the 0 &1 in string
			decimal = decimal / 2;
		}
		return binary;
	}

	// anagrmaprimaenumber
	public static String[] checkPrime(int limit)
	{
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i < limit; i++) //limit  times
		{
			boolean isPrime = true;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime) 
			{
				array[position] = String.valueOf(i);//index ibvalue to string
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) 
		{
			array1[k] = array[k];
		}
		return array1;

	}

	public static boolean palindrome(String s) {
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) 
		{
			if (c[i] != c[n - 1 - i])
			{
				return false;
			}
		}
		return true;
	}

	public static boolean checkAnagrams(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] a = string1.toCharArray();
		sort(a);
		char[] b = string2.toCharArray();
		sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sort(char[] ab) 
	{
		for (int i = 0; i < ab.length; i++) 
		{
			for (int j = i + 1; j < ab.length; j++) 
			{
				if (ab[i] > ab[j]) {
					char temp = ab[i];
					ab[i] = ab[j];
					ab[j] = temp;
				}
			}
		}
	}

}// u
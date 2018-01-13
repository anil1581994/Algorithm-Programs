package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class AnagramPalindromePrime 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter limit upto where you want find Anagram and Palindrome of prime");
		int limit =utility.getInteger();
        System.out.println("Prime numbers between 1 and " + limit);
        String [] strArray=Utility.checkPrime(limit);
        for(int i=0;i<strArray.length;i++)
        {
        System.out.print(strArray[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Anagram in given range of prime numbers are:");
        for (int i = 0; i < strArray.length; i++) 
        {
			for (int j = i + 1; j < strArray.length; j++) 
			{
				if (Utility.checkAnagrams(strArray[i], strArray[j]))
				{
					System.out.print(strArray[i] + "  " + strArray[j]+" ");
				}
			}
		}
        System.out.println("\n");
        System.out.println("Palindrome in given range of prime numbers are:");
		for (int i = 0; i < strArray.length; i++) 
		{
			if (Utility.palindrome(strArray[i]))
			{
				System.out.print(strArray[i]+"\t");
			}
		}
		

	}
	
}

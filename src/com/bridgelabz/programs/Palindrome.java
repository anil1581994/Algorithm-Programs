package com.bridgelabz.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check  palidrome");
		int n=s.nextInt();
		int r=0,sum=0;
		int temp=n;
		while(n>0)
	    {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			}
		if(temp==sum)
		{
			System.out.println("yes it is palindrome");
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}
	}

}

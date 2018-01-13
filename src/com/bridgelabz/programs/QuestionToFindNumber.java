package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class QuestionToFindNumber {

		public static void main(String[] args) 
		{
			System.out.println("Run1");
			  Utility utility=new Utility();
			     System.out.println("enter the number");
			    int number = utility.getInteger();
		        int n = (int) Math.pow(2, number);
		        System.out.println("............Run..2...........");
		        System.out.printf("Think of an integer between ", 0, n-1);
		        int secretNumber = utility.search(0, n);
		        System.out.printf("Your number is", secretNumber);
		}
	}

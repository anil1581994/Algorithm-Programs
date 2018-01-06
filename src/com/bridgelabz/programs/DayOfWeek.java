package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {


	public static void main(String[] args) 
	{
		   Utility utility=new Utility();
		   System.out.println("Enter the month");
			int month=Integer.parseInt(args[0]);
			System.out.println("enter the day");
			int day=Integer.parseInt(args[1]);
			System.out.println("enter the year");
			int year=Integer.parseInt(args[2]);
			
			utility.dayOfWeek(month,day,year);


	}

}

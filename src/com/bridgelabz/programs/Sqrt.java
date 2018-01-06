package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Sqrt {


	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter the value of c to find sqrt");
		double c=Double.parseDouble(args[0]);
		//double c=utility.getDouble();
		utility.sqrt(c);
}
	
}

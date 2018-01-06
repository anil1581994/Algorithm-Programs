package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class payment {


	public static void main(String[] args)
	{
		Utility utility=new Utility();
	    
		int p=Integer.parseInt(args[0]);
		
		int y=Integer.parseInt(args[1]);
		
		double r=Double.parseDouble(args[2]);
		utility.monthlyPayment(p,y,r);
	}
}


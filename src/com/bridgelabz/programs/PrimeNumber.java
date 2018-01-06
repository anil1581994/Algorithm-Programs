package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeNumber
	{
	    
	
	   public static void main (String[] args)
	   {		
	       Utility utility=new Utility();
	       //Empty String
	       //String  primeNumbers = "";
		   System.out.println("Enter the value of n:");
		    int n =utility.getInteger();
		    utility.findPrime(n);
		  
	   }
	}



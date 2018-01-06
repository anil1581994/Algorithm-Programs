package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinary 
{
	public static void main(String[] args)
    {
		Utility utility=new Utility();
		int decimal;
		double sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Decimal number.......");
		decimal=scanner.nextInt();
		String binary=utility.toBinary(decimal);//deci to bin
		System.out.println(binary);
		
		char arr[]=binary.toCharArray();
		int result=(int) toDecimal(arr,sum);
		
		if(decimal==result)
			
		System.out.println("The Given Number Is Power Of 2");
	 	else 
	 	System.out.println("It is not");
		scanner.close();
	}
	
	
	

	private static double toDecimal(char[] arr, double sum) //decimal and decimal series
	{
		int k=0;
		String powerTwo="";
		for (int i=arr.length-1;i>=0;i--)//<---reverse
		{
			if(arr[i]=='1')
			{
				sum=sum+(Math.pow(2, k));
				if(k<arr.length-1)
					powerTwo=powerTwo+(Math.pow(2, k))+"+";
					else
				powerTwo=powerTwo+(Math.pow(2, k))+"=";
			}
			k++;
		}
		System.out.print(powerTwo);//binary string
		System.out.println(sum);//sum
		return sum;
} 
}

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {
	
 public static void main(String[] args)
 {
	 Utility utility=new Utility();
	 //step-1 Read Integer   & convert into binary
	 
	   Scanner scanner=new Scanner(System.in);
		int decimal;
		 double sum=0.0;
		  int k=0;
		System.out.println("Enter the Number......");
		decimal=scanner.nextInt();
		
		String binaryNum=utility.toBinary(decimal);
		System.out.println(binaryNum);
		
		System.out.println(decimal + " in binary representation is........: " + binaryNum);
		char arr [] = binaryNum.toCharArray();
		
		while(binaryNum.length()!=8)
		{
			binaryNum = "0"+binaryNum;
		}
		System.out.println(decimal + " after adding 0 in binary representation is........: " + binaryNum);
		//swap nibble--2
		int j=4;
		char arr1 [] = binaryNum.toCharArray();
		for (int i=0;i<arr1.length/2;i++)
		{
			char temp1 = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp1;
			j++;
			
		}
		System.out.println(" char array(nibble) after swap");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]);
		//convert the swap nibble into Decimal
		int finalResult=(int) toDecimal( arr1,0);
		 System.out.println("After  swap decimal value of nibble is:"+finalResult);
		 
		 //check the final number is power of to or not
		 System.out.println(isPowerOfTwo(finalResult)?"yes it is power of 2":"no it is not power of 2");
		
    }
   private static double toDecimal(char[] arr1, double d) 
    {
	 int k=0,sum=0;
      String powerTwo="";
     for(int i=arr1.length-1;i>=0;i--)
     {
	  if(arr1[i]=='1')
	  {
		  sum=(int) (sum+(Math.pow(2,k)));
	  }
	  k++;
    }
	return sum;
    }	
   private static boolean isPowerOfTwo(int x)
   {
	
	return x!=0 && ((x&(x-1)) == 0);//70&69..32&31
   }
}//class

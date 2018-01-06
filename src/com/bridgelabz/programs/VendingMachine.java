package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int money;
		
		System.out.println("Enter the Money.....");
		money=utility.getInteger();
		int notes[]= {1000,500,100,50,10,5,2,1};
		
		utility.vendingMachineCal(money,notes);
		//System.out.println("the total number of notes in given money"+utility.calnotes);
		
	
}
}

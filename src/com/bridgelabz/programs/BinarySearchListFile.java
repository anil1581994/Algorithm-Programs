package com.bridgelabz.programs;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchListFile {

	public static void main(String[] args) {
		Utility utility = new Utility();
		try {
			String key;
			String word = null;
			Scanner scanner = new Scanner(System.in);
			File file = new File("/home/bridgelabz/eclipse-workspace/Algorithm Programs/temp.txt");

			
			if (file.exists()) 
			{
				if (file.canRead()) 
				{
					BufferedReader bufferReader = new BufferedReader(new FileReader(file));
					word = bufferReader.readLine();

					//bufferReader.close();
					String[] str = word.trim().split(" ");

					utility.bubbleSort2(str);// sort the line with alphabhet
					utility.display(str);
					System.out.println("Enter the Key To search....");
					key = scanner.nextLine();
					scanner.close();
					if (utility.binarySearch(str, key, 0, str.length - 1) > 0)
					{
						System.out.println("Element is found......");
						// bufferReader.close();
					} else 
					{
						System.out.println("Not Found......");

					}
					
				} else 
				{
					System.out.println("file cant read");
				}
			} else

			{
				System.out.println("file not found");
			}
		} catch (Exception e) {
		    
			e.printStackTrace();
		}
	}
}

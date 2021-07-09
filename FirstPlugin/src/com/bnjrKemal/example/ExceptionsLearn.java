package com.bnjrKemal.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
public class ExceptionsLearn extends Exception {

	/*
	public ExceptionsLearn() {	}
	
	ExceptionsLearn(String str){
		super(str);
	}
	
	ExceptionsLearn me = new ExceptionsLearn("Exception details");
	*/

	private static int accno[] = {1001, 1002, 1003, 1004, 1005};
	
	private static String name[] = {"Nish", "Shubh", "Abhi", "Akash", "Kemal"};
	
	private static double bal[] = {10000.0, 12000.0, 5600.0, 999.0, 1100.55};
	
	ExceptionsLearn(){};
	
	ExceptionsLearn(String str){
		super(str);
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("ACCNO" + "\t" + "CUSTOMER"+ "\t" + "BALANCE");
			for(int i = 0; i < 5; i ++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				if(bal[i] < 1000) {
					ExceptionsLearn me = new ExceptionsLearn("Balance is less than 1000");
					throw me;
				}
			}
		}catch(ExceptionsLearn e) {
			e.printStackTrace();
		}
		
		/*
		 * Built-in Exceptions
		 * 
		 * 1. ArithmeticException
		 * 2. ArrayIndexOutOfBoundsException
		 * 3. ClassNotFoundException
		 * 4. FileNotFoundException
		 * 5. IOException
		 * 6. InterruptedException
		 * 7. NoSuchFieldException
		 * 8. NoSuchMethodException
		 * 9. NullPointerException
		 * 10. NumberFormatException
		 * 11. RuntimeException
		 * 12. StringIndexOutOfBoundsException
		 */	
	}
	
	/* Examples of Built-in Exception */
	
	public void ArithmeticException() {
		try {
			int a = 30, b = 0;
			int c = a/b;
			System.out.println("Result = " + c);
		}catch(ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
	}
	
	@SuppressWarnings("null")
	public void NullPointerException() {
		try {
			String a = null;
			System.out.println(a.charAt(0));
		}catch(NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}
	
	public void StringIndexOutOfBoundException() {
		try {
			String a = "This is like chipping "; //length is 22
			char c = a.charAt(24); //accessing 25th element
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
	
	public void ClassNotFoundException() {
		try {
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			System.out.println("File does not exist");
		}
	}
	
	public void NumberFormatException() {
		try {
			int num = Integer.parseInt("akki");
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
	
	public void ArrayIndexOutOfBoundsException() {
		try {
			int a[] = new int[5];
			a[6] = 9;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}
	}
	
	/* User-Defined Exceptions */
	
	
	
	
	
}

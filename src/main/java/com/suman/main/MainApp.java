package com.suman.main;

import java.util.Scanner;

import com.suman.numbertoword.NumberToWord;

/**
 * 
 * @author Suman Behara<sumanbehara1@gmail.com>
 * @since 1
 * @version 1
 *
 *          MainApp Class used to run main method. Start the application by
 *          using below main method as it's an standalone Application
 */
public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			int number;
			// Scanner used to take input number values from console/terminal
			scanner = new Scanner(System.in);
			System.out.println("Enter a number to convert into word format :");
			number = scanner.nextInt();
			System.out.println("================== output =======================");
			System.out.println(number + " = " + NumberToWord.numberToWord(number));
			System.out.println("================================================= \n");
		} catch (Exception e) {
			System.out.println("Error While reading or converting number to Word Form" + e);
		}
	}
}

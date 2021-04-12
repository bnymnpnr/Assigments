package Lab2;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		/*
		 * Question-5
		 * 
		 * Write a program that computes the tax and tip on a restaurant bill. The
		 * program should ask the user to enter the charge for the meal. The tax should
		 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
		 * after adding tax. Display the meal charge, tax amount, tip amount, and total
		 * bill on the screen.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the meal charge:");
		double mealCharge = scan.nextDouble();

		double tax = mealCharge * 0.0675;
		double tip = (mealCharge + tax) * 0.2;
		double totalBill = mealCharge + tax + tip;

		System.out.println("Meal charge is: " + mealCharge);
		System.out.println("Tax is: " + tax);
		System.out.println("Tip is: " + tip);
		System.out.println("Total bill is: " + totalBill);

	}

}

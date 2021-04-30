package Replit;

import java.util.Scanner;

public class monthRainfall {

	public static void main(String[] args) {
		/*
		 * TaskWrite a RainFallclass that stores the total rainfall for each of 12
		 * months into an array of doubles. The program should have methods that return
		 * the following: -total rainfall for the year -the average monthly rainfall
		 * -the month with the most rain -the month with the least rainInput Validation:
		 * Do not accept negative numbers for the monthly rainfall figures.
		 */

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int monthLength = months.length;

		totalRainfall(months, monthLength);
	}

	private static void totalRainfall(String[] months, int monthLength) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the rainfall (in inches)");

		double sum = 0;
		double inches = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (int i = 0; i < months.length; i++) {

			System.out.print(months[i] + ":");
			inches = scan.nextDouble();

			if (inches < 0) {
				System.out.println("Don't enter negative number:");
				i--;
				continue;
			}

			if (inches > max) {
				max = inches;
			}

			if (inches < min) {
				min = inches;
			}

			sum += inches;
		}

		double avarage = sum / monthLength;
		System.out.println("Sum of all rain: "+sum);
		System.out.println("Avarage rainfall: "+avarage);
		System.out.println("Max rain: "+max);
		System.out.println("Min rain: "+min);

	}

}

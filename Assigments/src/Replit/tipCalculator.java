package Replit;

import java.util.Scanner;

public class tipCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String split;
		int numberOfPeople;
		double checkAmount;
		String quality;
		double totalTip = 0;

		System.out.print("Split:");
		split = scan.next();

		System.out.print("Number of people:");
		numberOfPeople = scan.nextInt();

		System.out.print("Check amount:");
		checkAmount = scan.nextDouble();

		System.out.print("Service Quality:");
		quality = scan.next();

		System.out.println("Number of people entered: " + peopleConverter(numberOfPeople));

		System.out.println("Total to pay: " + getTotalPay(split, quality, checkAmount, totalTip));

		System.out.println("Total tip: " + getTotalTip(split, quality, checkAmount, totalTip));

		if (split.equalsIgnoreCase("yes")) {
			System.out.println(
					"Total per person: " + getTotalPay(split, quality, checkAmount, totalTip) / numberOfPeople);

			System.out
					.println("Tip per person: " + getTotalTip(split, quality, checkAmount, totalTip) / numberOfPeople);

		}

	}

	public static String peopleConverter(int numberOfPeople) {
		String str = "";
		for (int i = 0; i < numberOfPeople; i++) {
			str += "&";
		}
		return str;

	}

	public static double getTotalPay(String split, String quality, double checkAmount, double totalTip) {

		if (quality.equalsIgnoreCase("poor")) {
			totalTip = checkAmount * 0.05;

		} else if (quality.equalsIgnoreCase("fair")) {
			totalTip = checkAmount * 0.1;

		} else if (quality.equalsIgnoreCase("good")) {
			totalTip = checkAmount * 0.15;

		} else if (quality.equalsIgnoreCase("great")) {
			totalTip = checkAmount * 0.2;

		} else if (quality.equalsIgnoreCase("excellent")) {
			totalTip = checkAmount * 0.25;

		}

		return checkAmount + totalTip;

	}

	public static double getTotalTip(String split, String quality, double checkAmount, double totalTip) {

		if (quality.equalsIgnoreCase("poor")) {
			totalTip = checkAmount * 0.05;

		} else if (quality.equalsIgnoreCase("fair")) {
			totalTip = checkAmount * 0.1;

		} else if (quality.equalsIgnoreCase("good")) {
			totalTip = checkAmount * 0.15;

		} else if (quality.equalsIgnoreCase("great")) {
			totalTip = checkAmount * 0.2;

		} else if (quality.equalsIgnoreCase("excellent")) {
			totalTip = checkAmount * 0.25;

		}

		return totalTip;

	}

}
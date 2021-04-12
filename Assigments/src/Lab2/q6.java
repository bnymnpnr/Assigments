package Lab2;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		/*
		 * Question-6
		 * 
		 * Write a program that will ask the user to enter the amount of a purchase. The
		 * program should then compute the state and county tax sales tax. Assume the
		 * state sales tax is 4 percent and the county sales tax is 2 percent. The
		 * program should display the amount of the purchase , the state sales tax, the
		 * county sales tax, the total sales tax, and the total of the sale (which is
		 * the sum of the amount of purchase plus the total sales tax)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the amount of purchase");
		double purchase = scan.nextDouble();
		double stateTax = purchase * 0.02;
		double countyTax = (purchase + stateTax) * 0.04;
		double totalSale = purchase + stateTax + countyTax;

		System.out.println("Amount of purchase is: " + purchase);
		System.out.println("State tax is: " + stateTax);
		System.out.println("County tax is:" + countyTax);
		System.out.println("Total sale is:" + totalSale);

	}

}

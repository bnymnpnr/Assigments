package Assigment_8;

public class q13 {

	public static void main(String[] args) {
		/*
		 * Question-13
		 * 
		 * This method calculates a water bill, the method gets a double and returns a
		 * double.
		 * 
		 * The more water you use the more it will cost you (as a fine for wasting
		 * water).
		 * 
		 * for example:
		 * 
		 * waterTax(50) returns 30
		 * 
		 * waterTax(55) returns 49.5
		 * 
		 * waterTax(101) returns 140.9
		 * 
		 * waterTax(151) returns 235.9
		 * 
		 * the regular calculation under 50 is bill = units * 0.60; above 50 is: bill =
		 * units * 0.90;
		 * 
		 * above 100 the calculation is like above 50 but with a 50 as fine
		 * 
		 * and above 150 it is the same as above 50 (units *0.90) but with a 100 fine
		 * added to the price.
		 */
		double water = 151;

		System.out.println(waterTax(water));
	}

	private static double waterTax(double water) {
		double bill = 0;

		if (water <= 50) {
			bill = water * 0.6;
		} else if (water > 50 && water < 100) {
			bill = water * 0.9;
		} else {
			int multiple = (int) ((water - 50) / 50);
			bill = water * 0.9 + (multiple * 50);
		}
		return bill;

	}

}

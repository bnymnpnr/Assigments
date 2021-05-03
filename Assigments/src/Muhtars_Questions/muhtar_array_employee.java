package Muhtars_Questions;

public class muhtar_array_employee {

	public static void main(String[] args) {
		/*
		 * given the arrays of employee names and their salaries:
		 * 
		 * String[] employees = {"John", "Conor McGregor", "Rose", "Breanna", "Shay",
		 * "Khabib"}
		 * 
		 * int[] salaries = {100000, 70000, 95000, 110000, 120000, 150000}
		 * 
		 * 1. display the name of the employee who has the highest salary
		 * 
		 * 2. display the name of the employee who has the lowest salary
		 */

		String[] employees = { "John", "Conor McGregor", "Rose", "Breanna", "Shay", "Khabib" };

		int[] salaries = { 100000, 70000, 95000, 110000, 120000, 150000 };

		int min = salaries[0];
		int max = salaries[0];

		int indexOfMin = salaries[0];
		int indexOfMax = salaries[0];

		for (int i = 0; i < salaries.length; i++) {

			if (salaries[i] < min) {
				min = salaries[i];
				indexOfMin = i;
			}

			if (salaries[i] > max) {
				max = salaries[i];
				indexOfMax = i;
			}

		}

		System.out.println(min + " " + employees[indexOfMin]);
		System.out.println(max + " " + employees[indexOfMax]);

	}

}

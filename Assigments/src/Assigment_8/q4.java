package Assigment_8;

public class q4 {

	public static void main(String[] args) {
		/*
		 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
		 * 
		 * q4
		 * 
		 * 
		 * hint: you will need to use two nested for loops for that, and an if that
		 * checks if its the last or first iteration of the loop (so you will know whet
		 * to print "*" or " ")
		 */
		
		
		printHollowRect(5);

	}

	private static void printHollowRect(int num) {
		String star = "";

		for (int row = 0; row < num; row++) {
			if (row == 0 || row == num - 1) {
				for (int i = 0; i < num - 1; i++) {
					star += "*";
				}
				System.out.print(star);
				star = "";
			} else {
				System.out.print("*");
			}
			for (int col = 0; col < num - 2; col++) {
				if (!(row == 0 || row == num - 1)) {
					System.out.print(" ");
				}

			}

			System.out.println("*");
		}
	}

}

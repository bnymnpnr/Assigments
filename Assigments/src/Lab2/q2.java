package Lab2;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		/*
		 * Question-2
		 * 
		 * A bag of cookies holds 40 cookies. The calorie information on the bag claims
		 * that there are 10 serving in the bag and that a serving equals 300 calories.
		 * write a program that lets the user enter the number of cookies he or she
		 * actually ate and then reports the number of total calories consumed.
		 */

		Scanner scan = new Scanner(System.in);

		int caloriOfEachCake = 300 / 10;
		int caloriYouAte = 0;
		int numberOfCookiesYouAte = 0;

		while (true) {
			System.out.println("Enter the number of cookies that you ate: (Don't lie to me!)");
			numberOfCookiesYouAte = scan.nextInt();

			caloriYouAte += caloriOfEachCake * numberOfCookiesYouAte;
			System.out.println("Total Calori You Ate:  " + caloriYouAte);

		}

	}

}

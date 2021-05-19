package EncapsulationLab;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		RoulettePocket roulettePocket = new RoulettePocket(number);
		System.out.println(roulettePocket.getPocketColor(number));

	}

}

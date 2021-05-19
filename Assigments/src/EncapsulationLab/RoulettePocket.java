package EncapsulationLab;
/*
 * Pocket 0 is green.
For pockets 1 through 10, the odd-numbered pockets are red and the evennumbered
pockets are black.
For pockets 11 through 18, the odd-numbered pockets are black and the
even-numbered pockets are red.
For pockets 19 through 28, the odd-numbered pockets are red and the evennumbered
pockets are black.
For pockets 29 through 36, the odd-numbered pockets are black and the
even-numbered pockets are red.
 */

public class RoulettePocket {

	private int pocketNumber;

	public RoulettePocket(int pocketNumber) {
		this.pocketNumber = pocketNumber;
	}

	public String getPocketColor(int pocketNumber) {

		if (pocketNumber < 0 || pocketNumber > 36) {

			return "Invalid Number";
		}
		String color = "";

		boolean isOdd = pocketNumber % 2 == 1;

		if (pocketNumber == 0) {
			color = "green";
		} else if (pocketNumber >= 1 && pocketNumber <= 10) {
			if (isOdd) {
				color = "red";
			} else {
				color = "black";
			}
		} else if (pocketNumber >= 11 && pocketNumber <= 18) {
			if (isOdd) {
				color = "black";
			} else {
				color = "red";
			}
		} else if (pocketNumber >= 19 && pocketNumber <= 28) {
			if (isOdd) {
				color = "red";
			} else {
				color = "black";
			}
		} else if (pocketNumber >= 29 && pocketNumber <= 36) {
			if (isOdd) {
				color = "black";
			} else {
				color = "red";
			}
		}

		return color;
	}

}

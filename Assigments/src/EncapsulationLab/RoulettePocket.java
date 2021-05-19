package EncapsulationLab;

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
		} else if (pocketNumber >= 1 && pocketNumber <= 10 || pocketNumber >= 19 && pocketNumber <= 28) {
			if (isOdd) {
				color = "red";
			} else {
				color = "black";
			}
		} else if (pocketNumber >= 11 && pocketNumber <= 18 || pocketNumber >= 29 && pocketNumber <= 36) {
			if (isOdd) {
				color = "black";
			} else {
				color = "red";
			}
		}

		return color;
	}

}

package Assigment_8;

public class q11 {

	public static void main(String[] args) {
		/*
		 * Question-11
		 * 
		 * c_profits gets the buyPrice(int) and sellPrice(int) and determines if there
		 * was a profit or loss. it returns a string value that can be
		 * "profit","loss","no loss"
		 * 
		 * for example: c_profis(100,1500) returns : "profit"
		 * 
		 * c_profis(20,5) returns : "loss"
		 * 
		 * c_profis(100,100) returns : "no loss"
		 */
		
		
		int buyPrice = 50;
		int sellPrice = 50;

		System.out.println(c_profits(buyPrice, sellPrice));
	}

	private static String c_profits(int buyPrice, int sellPrice) {
		if (sellPrice(sellPrice) > buyPrice(buyPrice)) {
			return "profit";
		} else if (sellPrice(sellPrice) < buyPrice(buyPrice)) {
			return "loss";
		} else {
			return "no loss";
		}

	}

	private static int buyPrice(int buyPrice) {
		return buyPrice;
	}

	private static int sellPrice(int sellPrice) {
		return sellPrice;
	}

}

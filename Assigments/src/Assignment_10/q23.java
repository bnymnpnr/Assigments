package Assignment_10;

public class q23 {

	public static void main(String[] args) {
		/*
		 * Question-23
		 * 
		 * A sandwich is two pieces of bread with something in between. Print the string
		 * that is between the first and last appearance of "bread" in the given string,
		 * or return string "nothing" if there are not two pieces of bread.
		 * 
		 * Sample Output:
		 * 
		 * input: breadjambread output: jam
		 * 
		 * input: xxbreadjambreadyy output: jam
		 * 
		 * input: xxbreadapple output: nothing
		 * 
		 * input: breadbutterbread output: butter
		 */
		
		// I WILL TURN BACK THIS QUESTION !!!

		String word = "breadjambread";
		int lastIndexOfFirstBread = word.indexOf("bread") + "bread".length();
		int firstIndexOfSecondBread = word.lastIndexOf("bread");
		
		String wordBetweenFirstAndSecondBread = word.substring(lastIndexOfFirstBread, firstIndexOfSecondBread);
		
		if(wordBetweenFirstAndSecondBread.equals("bread")) {
			System.out.println("nothing!");
			return;
		}
		
		System.out.println(wordBetweenFirstAndSecondBread);

	}

}

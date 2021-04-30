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
		

		String word = "breadbutterbread";
		int firstBreadIndex = word.indexOf("bread");
		int secondBreadIndex = word.indexOf("bread", firstBreadIndex + 1);

		String dummy = word;

		dummy = dummy.replaceFirst("bread", "");

		if (dummy.contains("bread")) {
			dummy = word.substring(firstBreadIndex + 5, secondBreadIndex);
			System.out.println(dummy);
		} else {
			System.out.println("nothing!");
		}

	}

}

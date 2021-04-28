package Assignment_10;

public class q27_ {

	public static void main(String[] args) {
		/*
		 * Question-27
		 * 
		 * coverString method will take 2 string parameters from the caller.
		 * 
		 * Your job is to write an important code that will :
		 * 
		 * - to search and find each appearance of coverME within main - then surround
		 * it with [coverMe] (square brackets) - if you cannot find the coverME within
		 * main after tirelessly looping then just return whole main itself covered
		 * [main]. - keep in mind that coverME value can be of any length.
		 * 
		 * Sample Output:
		 * 
		 * coverString("java methods", "me") ) ; ==> "java [me]thods"
		 * 
		 * coverString("Certified Wooden Spoon", "o") ) ; ==>
		 * "Certified W[o][o]den Sp[o][o]n"
		 * 
		 * coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
		 * 
		 * coverString("apples", "pears") ) ; ==> "[apples]"
		 */

		String word = "Certified Wooden Spoon";
		String cover = "o";

		System.out.println(coverString(word, cover));

	}

	public static String coverString(String word, String cover) {

		String result = "";
		int counter = 0;

		for (int i = 0; i <= word.length() - cover.length(); i++) {

			if (word.substring(i, i + cover.length()).equals(cover)) {

				result += word.replace(word.substring(i, i + cover.length()), "[" + cover + "]");
				counter++;
				break;
			}
		}

		if (counter == 0) {
			result = "[" + word + "]";
		}

		return result;
	}

}

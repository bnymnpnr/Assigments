package Assignment_10;

public class q16 {

	public static void main(String[] args) {
		/*
		 * Question-16
		 * 
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in
		 * the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
		 * string should be 4 and more characters.
		 * 
		 * Sample Output: input: javapython output: true
		 * 
		 * input: cjavac++ output: true
		 * 
		 * input: c#javaruby output: false
		 */

		String word = "xxjava";

		if (word.length() < 4) {
			System.out.println("Word length must be greater than or equal 4!");
			return;
		}

		if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}

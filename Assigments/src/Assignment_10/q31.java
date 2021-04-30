package Assignment_10;

public class q31 {

	public static void main(String[] args) {
		/*
		 * Question-31
		 * 
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward, e.g., madam or nurses run.
		 * 
		 * So method isPalindrome checks that and returns true if check is palindrome
		 * and false if it is not.
		 * 
		 * - make your conditions case insensitive. ex: Civic and civic are both
		 * palindromes - make your conditions space insensitive. Race car is a
		 * palindrome even though there is space in between.
		 * 
		 * Sample Output:
		 * 
		 * isPalindrome("Noon") ==> true
		 * 
		 * isPalindrome("I am not palindrome") ==> false
		 * 
		 * isPalindrome("wooden") ==> false
		 * 
		 * isPalindrome("Nurses Run") ==> true
		 */

		isPalindrome("Nurses Run");

	}

	private static void isPalindrome(String str) {
		str = str.toLowerCase();
		str = str.replace(" ", "");

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equals(reverse)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}

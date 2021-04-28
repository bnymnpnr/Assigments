package Assignment_10;

public class q17 {

	public static void main(String[] args) {
		/*
		 * Question-17
		 * 
		 * Write a program that will print out letters in the alphabetic order
		 * accordingly to the given range within 2 chars.
		 * 
		 * Sample Output:
		 * 
		 * input: A input: Z output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 * 
		 * input: a input: f output: abcdef
		 * 
		 * input: a input: d output: abcd
		 * 
		 * input: B input: O output: BCDEFGHIJKLMNO
		 */

		// A-Z, 65-90
		// a-z, 97-122

		char first = 'a';
		char last = 'z';

		for (char i = first; i <= last; i++) {
			System.out.print(i + " ");
		}

	}

}

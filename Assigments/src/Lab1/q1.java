package Lab1;

public class q1 {

	public static void main(String[] args) {
		/*
		 * Question-1
		 * 
		 * Write a method that accepts a string and a non-negative number, and prints a
		 * larger string that is number copies of the original String
		 * 
		 * stringTimes("Hi", 2); = > HiHi stringTimes("Hi", 3); = > HiHiHi
		 * stringTimes("Hi", 1); = > Hi
		 */

		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}

	public static void stringTimes(String string, int i) {
		String result ="";
		for (int j = 0; j < i; j++) {
			result+= string;
		}
		System.out.println(result);

	}

}

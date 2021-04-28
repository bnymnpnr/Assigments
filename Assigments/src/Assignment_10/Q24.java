package Assignment_10;

public class Q24 {

	public static void main(String[] args) {
		/*
		 * Question-24
		 * 
		 * Given a string, print out true if the number of appearances of "java"
		 * anywhere in the string is equal to the number of appearances of "python"
		 * anywhere in the string (case sensitive).
		 * 
		 * Sample Output:
		 * 
		 * input: We study java not python output: true
		 * 
		 * input: What's the difference between java, javascript and python? output:
		 * false
		 */

		String word = "We study java not pythonjava";
		int counterJava = 0;
		int counterPython = 0;
		String java = "java";
		String python = "python";

		for (int i = 0; i <= word.length() - java.length(); i++) {
			if (word.substring(i, i + java.length()).equals(java)) {
				counterJava++;
			}
		}

		for (int i = 0; i <= word.length() - python.length(); i++) {
			if (word.substring(i, i + python.length()).equals(python)) {
				counterPython++;
			}
		}
		System.out.println(counterJava);
		if (counterJava == counterPython) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}

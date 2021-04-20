package Lab3;

public class q1 {

	public static void main(String[] args) {
		/*
		 * Question-1 Create a method that accepts 1 string, e.g. "Bob", return a
		 * greeting of the form "Hello Bob!". helloName("Bob") - "Hello Bob!"
		 * helloName("Alice") - "Hello Alice!" helloName("X") - "Hello X!"
		 */

		String name = "Benjamin";
		System.out.println(helloName(name));

	}

	public static String helloName(String name) {

		return "Hello " + name + "!";

	}

}

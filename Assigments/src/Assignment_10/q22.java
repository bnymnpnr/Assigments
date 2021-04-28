package Assignment_10;

public class q22 {

	public static void main(String[] args) {
		/*
		 * Question-22
		 * 
		 * Hypertext Markup Language (HTML) is the standard markup language for creating
		 * web pages and web applications. HTML is the language in which most websites
		 * are written. HTML is used to create pages and make them functional.
		 * 
		 * a10q22
		 * 
		 * Write a program, that will read HTML variable and output attribute value of
		 * id attribute (tag) into the console. Input will be provided in a single line
		 * as outlined below. If HTML variable doesn't contain <html> attribute, print
		 * out into the console message: "Invalid input!".
		 * 
		 * Sample Output:
		 * 
		 * input: <!DOCTYPE html><html><head><title>Java</title></head><body><p
		 * id="myid"></p></body></html> output: myid
		 */

		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		if (!(html.contains("html"))) {
			System.out.println("Invalid input!");
			return;
		}

		int indexOfFirstQuote = html.indexOf('"');
		int indexOfSecondQuote = html.indexOf('"', indexOfFirstQuote + 1);

		String wordBetweenTwoQuote = html.substring(indexOfFirstQuote + 1, indexOfSecondQuote);
		System.out.println(wordBetweenTwoQuote);

	}

}

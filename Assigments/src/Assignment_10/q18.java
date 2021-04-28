package Assignment_10;

public class q18 {

	public static void main(String[] args) {
		/*
		 * Question-18
		 * 
		 * Given two strings, word and a separator sep, return a big string made of
		 * count occurrences of the word, separated by the separator string.
		 * 
		 * Sample Output:
		 * 
		 * input: Word input: X input: 3 output: WordXWordXWord
		 * 
		 * input: This input: And input: 2 output: ThisAndThis
		 * 
		 * input: This input: And input: 1 output: This
		 */
		
		
		String word = "Word";
		String seperator = "X";
		
		int count = 5;
		
		for(int i = 0; i<count; i++) {
			System.out.print(word);
			
			if(i<count-1) {
				System.out.print(seperator);
			}
		}
		
	}

}

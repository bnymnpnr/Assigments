package Assigment_8;

public class q12 {

	public static void main(String[] args) {
		/*
		 * Question-12
		 * 
		 * The danish prince most famous quote is "to be or not to be". thats a classic
		 * example of boolean logic.
		 * 
		 * the hamletQuote method only returns true if one of or both of the boolean
		 * parameters is true.
		 * 
		 * example:
		 * 
		 * hamletQuote(true, false) returns true
		 * 
		 * hamletQuote(false,true) returns true
		 * 
		 * hamletQuote(true,true) returns true
		 * 
		 * hamletQuote(false,false) returns false
		 */
		
		
		boolean bool1 = true;
		boolean bool2 = false;

		System.out.println(hamletQuote(bool1, bool2));
	}

	private static boolean hamletQuote(boolean bool1, boolean bool2) {
		boolean flag = true;
		if (bool1 == false && bool2 == false) {
			flag = false;
		}
		return flag;
	}

}

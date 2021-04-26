package Assigment_8;

public class q10 {

	public static void main(String[] args) {
		/*
		 * Question-10
		 * 
		 * isEven method gets a number(int) if its even (2,4,8...) returns true. if its
		 * odd return false.
		 * 
		 * for example:
		 * 
		 * isEven(1) --> false
		 * 
		 * isEven(8) --> true
		 */
		
		int number=8;
		isEven(number);
		
	}

	private static void isEven(int number) {
		if(number%2==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}

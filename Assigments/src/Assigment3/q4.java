package Assigment3;

public class q4 {

	public static void main(String[] args) {
		/*
		Question-4

Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10
		 */
		
		int num1 = 3;
		int num2 = 5;
		int temp =num2;
		
		// before:
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		num2 = num1;
		num1= temp;
		
		// after:
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

	}


}

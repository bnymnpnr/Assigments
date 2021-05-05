package Lab_4;

import java.util.Arrays;

public class q19 {

	public static void main(String[] args) {
		// q19 Write a method that accepts an array and prints the total of the numbers
		// in the array, except ignore sections of numbers starting with a 6 and
		// extending to
		// the next 7 (every 6 will be followed by at least one 7)

		int[] x = { 1, 2, 2, 6, 99, 99, 7 };
		
		int sum = 0;
		int indexOf6 = 0;
		int indexOf7 = 0;

		for (int i = 0; i < x.length; i++) {
			if (!(x[i] == 6)) {
				sum += x[i];
			} else {
				indexOf6 = i;
				break;
			}
		}

		for (int i = indexOf6; i < x.length; i++) {
			if (x[i] == 7) {
				indexOf7 = i;
				break;
			}
		}

		if (indexOf7 != 0) {
			for (int i = indexOf7 + 1; i < x.length; i++) {
				sum += x[i];
			}

		}

		System.out.println(sum);
		

//		int sum = 0;		
//		
//		boolean boolCheckSix = false;	
//		for (int i = 0; i < x.length; i++) {
//
//			if (boolCheckSix) {
//
//				if (x[i] == 7) {
//
//					boolCheckSix = false;
//				}
//
//			} else if (x[i] == 6) {
//
//				boolCheckSix = true;
//
//			} else {
//
//				sum = sum + x[i];
//			}
//		}
//		System.out.println(sum);
	}

}

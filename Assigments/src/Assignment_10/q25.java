package Assignment_10;

public class q25 {

	public static void main(String[] args) {
		/*
		 * Question-25
		 * 
		 * When gears merge and work together, one tooth from each one goes in order.
		 * Write a method mergeStrings that will return the strings merged, one letter
		 * at a time, starting with one. Please note one and two can be of different
		 * lengths. Please look at below examples:
		 * 
		 * s1 ==> "12345" s2 ==> "abcde" mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		 * 
		 * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		 * 
		 * mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */

		String s1 = "12345";
		String s2 = "abcde";
		mergeStrings(s1, s2);

	}

	private static void mergeStrings(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		String combine = "";

		for (int i = 0; i < l1 + l2; i++) {
			String w1 = "";
			String w2 = "";

			if (i < l1) {
				w1 = s1.charAt(i) + "";
			}

			if (i < l2) {
				w2 = s2.charAt(i) + "";
			}

			combine += w1 + w2;
		}

		System.out.println(combine);

	}

}

package Lab_4;

public class q4 {

	public static void main(String[] args) {
		/*
		 * Question-4 Write a method that accepts an array and prints the sum of all
		 * elements in the array int[] x = {1,2,3}; = > 6 int[] y = {5,11,2}; = > 18
		 * int[] z = {7,0,0}; = > 7 int[] a = {3,-2,10,4}; = > 15
		 */
		
		
		int[] x = {1,2,3}; 
		sum(x);
	}

	private static void sum(int[] x) {
		int sum=0;
		for (int i : x) {
			sum+=i;
		}
		System.out.println(sum);
	}
	

}

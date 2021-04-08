package Assigment3;

public class q6 {

	public static void main(String[] args) {
		/*
		 Question-6

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
		 */

		int caffeineInMg = 500;
		int lethalOverdoseInMg = 10*1000;
		
		int result = lethalOverdoseInMg/caffeineInMg;
		
		System.out.println(" Number of milligrams in drink: "+ caffeineInMg);
		System.out.println(" It would take about "+result+" drinks for a lethal overdose");
		
	}

}

import java.util.Scanner;

import java.util.Random;

public class GuessingSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("**** Welcome to Guess the Number ****");
		System.out.println("Please guess using the key pad a number.");
		Random rand = new Random();
		
		int answer = rand.nextInt(10) + 1;
		//A good way to debug/test this line of code is to have is print in testing, but remove for final game.
		
		int attempts = 0;

		while (attempts <= 4) {
			/*
			 * while is the key word to create the loop (attempts < 4) is the condition
			 * checked before looping back in
			 */

			

			if (attempts == 4) {
				System.out.println("But your out of guesses, you lose.");
				System.out.println("Program Terminated...");
				break;
			} else {
				attempts = attempts + 1;//attempts++; would replace this code.
				/*
				 * this line keeps the code from looping infinitely by breaking the condition ++
				 * is short hand for + 1
				 */
				System.out.println(" Attempt " + attempts + "...");
				System.out.println("*************************************");
			
				int rNumber = -1;
			
	
				rNumber = rand.nextInt(10) + 1;
				/*
				 * In the () the default range is 0 (max - min + 1) (10) creates the range 0 to
				 * 9
				 */
	
				int guess = input.nextInt();
	
				if (guess == 20) {
					guess = rNumber;
					System.out.println("Random guess was " + rNumber);
				}
				if (guess == -1) {
					System.out.println("Program terminated.");
					System.exit(0);
					// System.exit(0); is a termination command
				}
	
				if (guess == 0) {
					System.out.println("You must choose one of the following: \n1, 2, 3, 4, 5, 6, 7, 8, 9 or 10.");
	
				} else if (guess > answer) {
					System.out.println("Guess Again. The number is LOWER.");
	
				} else if (guess < answer) {
					System.out.println("Guess Again. The number is HIGHER.");
	
				} else {
					System.out.println("Success!");
					System.out.println("Program terminated.");
					System.exit(0);
				}
			}

		}
		
		input.close();
	}

}

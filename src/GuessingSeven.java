import java.util.Scanner;

public class GuessingSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Guess a number between 0 and 11.");
		
		
		int attempts = 0;
		
		while (attempts < 3) {
		
			int guess = input.nextInt();	
		
		attempts = attempts + 1;
		 
		
		if (guess == -1) {
			System.out.println("Program terminated.");
			System.exit(0);
		} 
		
		if (guess == 0) {
			System.out.println("You must choose one of the following: \n1, 2, 3, 4, 5, 6, 7, 8, 9 or 10.");
			
		} else if (guess > 7) {
			System.out.println("Guess Again. The number is LOWER.");
		
		} else if (guess < 7) {
			System.out.println("Guess Again. The number is HIGHER.");
		
		} else {
			System.out.println("Success!");
			System.out.println("Program terminated.");
			System.exit(0);
		}
		}
		input.close();
	}

}

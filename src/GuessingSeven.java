import java.util.Scanner;

public class GuessingSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Guess a number between 0 and 11.");
		int guess = input.nextInt();
		
		if (guess == -1) {
			System.out.println("Program terminated.");
			System.exit(0);
		}
		
		if (guess == 0) {
			System.out.println("You must choose one of the following: \n1, 2, 3, 4, 5, 6, 7, 8, 9 or 10.");
			int guess2 = input.nextInt();
			if (guess2 == 7) {
				System.out.println("Success!");
			} else {
				System.out.println("Too bad you lose.");
			}	
		} else if (guess != 7) {
			System.out.println("Guess Again.");
			int guess2 = input.nextInt();
			if (guess2 == 7) {
				System.out.println("Success!");
			} else {
				System.out.println("Too bad you lose.");
			}
		} else {
			System.out.println("Success!");
		}
		
		input.close();
	}

}

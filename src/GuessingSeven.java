import java.util.Scanner;

public class GuessingSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Guess a number between 0 and 10.");
		int guess = input.nextInt();
		
		if (guess != 7) {
			System.out.println("Guess Again.");
		} else {
			System.out.println("Success!");
		}
		
		input.close();
	}

}

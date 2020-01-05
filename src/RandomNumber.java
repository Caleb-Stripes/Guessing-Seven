import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rNumber = -1;
		
		Random rand = new Random();
		
while (rNumber < 0 || rNumber > 10) {
		
	rNumber = rand.nextInt(11);
		
		
	}

		System.out.println(rNumber);
		
	}
}

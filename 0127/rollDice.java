package Java_6thLesson;
import java.util.Random;


public class rollDice {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		int dice = 1 + randomNumbers.nextInt(6);
		
		System.out.println("The dice is rolled: "+ dice);
		
		double dice2 = Math.random();
		System.out.println("The dice2 is rolled: "+ dice2);
		
	}
}

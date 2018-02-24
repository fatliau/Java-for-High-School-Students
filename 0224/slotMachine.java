package Java_9thLesson;
import java.util.Scanner;
import java.util.Random;


public class slotMachine {
	int slotA;// O P Q R S
	int slotB;
	int slotC;
	int cash;
	
	public slotMachine(){
		cash = 100;
	}
	
	public void roll(){
		cash = cash -10;
		Random rn = new Random();
		System.out.println();
		slotA = rn.nextInt(5);
		System.out.print(slotA+"|");
		slotB = rn.nextInt(5);
		System.out.print(slotB+"|");
		slotC = rn.nextInt(5);
		System.out.println(slotC);
		if(slotA == slotB && slotB == slotC && slotA != 0){
			cash += 50;
		}
		else if(slotA == slotB && slotB == slotC && slotA == 0){
			cash += 100;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		slotMachine game = new slotMachine();
		while(true){
			
			System.out.println("welcome, you have cash: $"+ game.cash);
			if(game.cash<10){
				System.out.println("Thank you! Next Time! you have cash: $"+ game.cash);
				break;
			}
			System.out.println("Insert $10, y/n ");
			String act = sc.next();
			if(act.contains("n")){
				System.out.println("Thank you! you have cash: $"+ game.cash);
				break;
			}
			else if(act.contains("y")){
				game.roll();
			}
		}
		sc.close();
	}
}

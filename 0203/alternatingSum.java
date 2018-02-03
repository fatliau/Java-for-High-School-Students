package Java_7thLesson;
import java.util.Scanner;

/** 
 * @author JC
 * Write a program that reads a sequence of integers into an array and that computes the alternating sum of all elements in the array. For example, if the program is executed with the input data
 * 1 4 9 16 9 7 4 9 11
 * then it computes
 * 1 − 4 + 9 − 16 + 9 − 7 + 4 − 9 + 11 = −2
 */
public class alternatingSum {
	
	public static void main(String[] args) {
		//mainNumber1();
		mainNumber2();
	}
	
	public static void mainNumber1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		int[] storage = new int[20];
		int i = 0;
		while(sc.hasNextInt() && i<7){
			storage[i] = sc.nextInt();
			i++;
		}
		int total = 0;
		for(int j=0; j<=i; j++){
			if(j % 2 == 0)
				total = total + storage[j];
			else
				total = total - storage[j];
		}
		System.out.println("outcome is: "+total);
		sc.close();
	}
	public static void mainNumber2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		//int[] storage = new int[20];
		int i = 0;
		int total = 0;
		while(sc.hasNextInt()){
			if(i%2==0)
				total = total + sc.nextInt();
			else
				total = total - sc.nextInt();
			i++;
		}
		System.out.println("outcome is: "+total);
		sc.close();
	}

}

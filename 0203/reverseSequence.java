package Java_7thLesson;
import java.util.Scanner;

public class reverseSequence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		int[] storage = new int[20];
		int index = -1;
		while(sc.hasNextInt()){
			index++;
			storage[index] = sc.nextInt();
		}
		for(int j = index; j>=0;j--){
			System.out.print(storage[j]+" ");
		}
		sc.close();
		
	}
	
	

}

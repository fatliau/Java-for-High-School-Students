package Java_7thLesson;
import java.util.Scanner;

/**(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is > best - 10
Grade is B if score is > best - 20;
Grade is C if score is > best - 30;
Grade is D if score is > best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
*/

public class AssignGrades {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int number = sc.nextInt();
		System.out.println("Enter "+number+" scores: ");
		int[] scores = new int[number];
		int topScore = -1;
		for(int i=0; i < number; i++){
			scores[i] = sc.nextInt();
			if(scores[i] > topScore)
				topScore = scores[i];
		}
		for(int i=0; i<number; i++){
			System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+gradeConvert(scores[i], topScore));
		}
		sc.close();
	}
	
	public static char gradeConvert(int score, int topScore){
		if(topScore - score <= 10){
			return 'A';
		}
		else if(topScore - score <= 20){
			return 'B';
		}
		else if(topScore - score <= 30){
			return 'C';
		}
		else if(topScore - score <= 40){
			return 'D';
		}
		else{
			return 'F';
		}	
	}

}

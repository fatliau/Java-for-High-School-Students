package Java_14Lesson;
import java.util.Scanner;

public class R5_17 {

	public static void main(String[] args) {
//		A student with a GPA of at least 1.5, but less than 2, is on
//		probation; with less than 1.5, the student is failing.
//		A: see p.191
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a GPA");
		float GPA = sc.nextFloat();
		if(GPA > 1.5)
			if(GPA < 2)
				System.out.println("on probation");
			else
				System.out.println("failing");
		sc.close();
	}
}

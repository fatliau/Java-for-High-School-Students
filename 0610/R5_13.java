package Java_14Lesson;
import java.util.Scanner;

public class R5_13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a month");
		String month = sc.nextLine();
		System.out.println("please enter a date");
		int date = sc.nextInt();
//		• New Year’s Day (January 1)
//		• Independence Day (July 4)
//		• Veterans Day (November 11)
//		• Christmas Day (December 25)
		if( month.equals("January") && date == 1){
			System.out.println("New Year’s Day");
		}
		else if( month.equals("July") && date == 4){
			System.out.println("Independence Day");
		}
		else if( month.equals("November") && date == 11){
			System.out.println("Veterans Day");
		}
		else if( month.equals("December") && date == 25){
			System.out.println("Christmas Day");
		}
		//System.out.println(month + Integer.toString(date));

		sc.close();
	}

}

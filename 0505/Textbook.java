package Java_13Lesson;

public class Textbook {
	
	public static void parseInt(String input){
		int count = Integer.parseInt(input);
		System.out.println(count+1);
	}
	
	public static void printFormat(){//p.158
		System.out.printf("float:%10.2f", 1.123456789);
		System.out.println();
		System.out.printf("Hexadecimal integer:%x\n", 10);
		String firstName = "John";
		String lastName = "Chen";
		System.out.printf("FirstName %s; LastName %s", firstName, lastName);
	}
	
	public static void main(String[] args) {
		System.out.println("15"+1);
		parseInt("15");
		System.out.println("\uD835\uDD6B");
		System.out.println("\uD835");
		System.out.println("\uDD6B");
		printFormat();
	}

}

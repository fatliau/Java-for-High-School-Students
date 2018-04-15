package Java_11Lesson;

public class StringObjects {

	public static void main(String[] args) {
		String str = new String("Hello, Dave");
		System.out.println(str);
		String str2 = "Hello, Dave";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		String hello = new String("hello");
		System.out.println(hello);
		hello = hello.toUpperCase();
		System.out.println(hello);
	}
}

package Java_12Lesson;

public class ComparableTest {
	
	public static void main(String[] args) {
		String a = "azz";
		String b = "cbb";
		String c = "zcc";
		String d = "!";
		System.out.println((int)a.charAt(0));//Unicode of the character
		System.out.println((int)b.charAt(0));
		System.out.println((int)c.charAt(0));
		System.out.println((int)d.charAt(0));
		System.out.println();
		System.out.println(b.compareTo(a));
		System.out.println(c.compareTo(a));
		System.out.println(d.compareTo(a));
		
	}

}

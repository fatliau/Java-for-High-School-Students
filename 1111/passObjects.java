package Java_2ndLesson;

public class passObjects {
	
	public static void main(String[] args) {
		
		Integer a = 5;
		Integer b = a;
		
		System.out.println(a);
		System.out.println(b);
		b = 6;
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		price c = new price();
		c.val = 5;
		price d = c;
		
		System.out.println(c.val);
		System.out.println(d.val);
		d.val = 6;
		System.out.println(c.val);
		System.out.println(d.val);
	}

}

class price{
	int val;
	
}
package Java_14Lesson;

public class R5_10 {
	
	public static String determinColor(String letter, int number){
		String color;
//		If the letter is an a, c, e, or g
		if(letter == "a" || letter == "c" || letter == "e" || letter == "g"){
//		If the number is odd
			if(number % 2 == 1)
				color = "black";
			else
				color = "white";
		}
		else{
//		If the number is even
			if(number % 2 == 0)
				color = "black";
			else
				color = "white";
		}
		return color;
	}
	
	public static void main(String[] args) {
		//branch 1
		System.out.println(determinColor("a", 1));
		//branch 2
		System.out.println(determinColor("c", 2));
		//branch 3
		System.out.println(determinColor("b", 4));
		//branch 4
		System.out.println(determinColor("d", 3));
		
	}

}

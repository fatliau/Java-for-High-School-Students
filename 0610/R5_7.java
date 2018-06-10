package Java_14Lesson;

public class R5_7 {
	
	public static void main(String[] args) {
		
//		Give an example for an if/else if/else statement where the order of the tests does
//		not matter. 
		int a = 10;
		if(a>10){
			System.out.println("a>10");
		}
		else if(a>15){
			System.out.println("a>15");
		}
		else{
			System.out.println("else");
		}

//		Give an example where the order of the tests matters.
		int b = 10;
		if(b==10){
			System.out.println("b==10");
		}
		else if(b==15){
			System.out.println("b==15");
		}
		else{
			System.out.println("else");
		}
		
	}

}

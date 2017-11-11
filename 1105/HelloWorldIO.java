package Java_1stLesson;
import java.io.IOException;

public class HelloWorldIO {
	
	public static void main(String[] args) throws IOException{
		while(true){
			byte data[] = new byte[11];
			System.out.println("Enter something to print or 'exit' to leave:");
			System.in.read(data);
			if( (char)data[0] == 'e' && (char)data[1] == 'x' && (char)data[2] == 'i' && (char)data[3] == 't' )
				break;
			System.out.print("You Entered: ");
			for (int i = 0; i < data.length; i++) {
				System.out.print((char)data[i]);
			}
		}
	}
}

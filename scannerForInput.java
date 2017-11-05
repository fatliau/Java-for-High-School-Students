import java.util.Scanner;

public class scannerForInput {
	
	public static void main(String []args){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Type in or type \"exit\" to leave:");
			String data=sc.nextLine();
			if(data.equals("exit")){
				break;
			}
			else{
				System.out.println("You entered: "+data);
			}
		}
	}
}

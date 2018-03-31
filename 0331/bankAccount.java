package Java_11Lesson;

public class bankAccount {
	protected double balance;
	
	public boolean withdraw(double number){
		if(balance < number){
			System.out.println("Insufficient balance");
			return false;
		}
		else if(number <= 0){
			System.out.println("Incorrect amount format");
			return false;
		}
		else{
			balance = balance - number;
			return true;
		}
	}
	public boolean deposit(double number){
		if(number <= 0){
			System.out.println("Incorrect amount format");
			return false;
		}
		else{
			balance = balance + number;
			return true;
		}
	}
	public boolean transfer(double number, bankAccount destination){
		if(this.withdraw(number)){
			destination.deposit(number);
			return true;
		}
		else{
			return false;
		}
	}
	public double getBalance(){
		return balance;
	}

}

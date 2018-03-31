package Java_11Lesson;

public class savingAccount extends bankAccount{
	
	private double interestRate;
	
	public savingAccount(){
		interestRate = 0.01;
	}
	
	public savingAccount(double initAmount, double rate){
		balance = initAmount;
		interestRate = rate;
	}
	
	public boolean assignInterest(int times){
		if(times <=0){
			System.out.println("Times must be large than 0");
			return false;
		}
		else{
			for(int i=0;i<times;i++){
				double interst = getBalance() * interestRate;
				deposit(interst);
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		savingAccount mySaving = new savingAccount(100, 0.1);
		
		System.out.println(mySaving.getBalance());
		mySaving.assignInterest(2);
		System.out.println(mySaving.getBalance());
	}
}
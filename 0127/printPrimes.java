package Java_6thLesson;

public class printPrimes {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i=2; i < 50; i++){
			
			if (primality(i)){
				System.out.print(i+" ");
				count += 1;
				if(count % 5 ==0){
					System.out.println();
				}
			}
		}
	}
	
	public static boolean primality(int n){
		for(int i=2; i<n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}

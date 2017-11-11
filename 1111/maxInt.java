package Java_2ndLesson;

import java.lang.Math;

public class maxInt {
	
	public static void main(String[] args){
		
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Math.round(Math.pow(2, 31)-1));
		System.out.printf("Max Integer: %11d\n", Integer.MAX_VALUE);
		System.out.printf("2^31 - 1   : %11.0f\n", Math.pow(2, 31)-1);
		
		System.out.println(Integer.SIZE);
	}

}

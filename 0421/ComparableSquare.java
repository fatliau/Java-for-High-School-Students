package Java_12Lesson;
import java.util.Collections;
import java.util.ArrayList;

public class ComparableSquare implements Comparable<ComparableSquare> {
	public int length;
	public int area;
	
	public ComparableSquare(int l){
		length = l;
		area = l*l;
	}

	public int compareTo(ComparableSquare other) {
		return this.area - other.area;
	}

	public static void main(String[] args) {
		ComparableSquare a = new ComparableSquare(2);
		ComparableSquare b = new ComparableSquare(3);
		ComparableSquare c = new ComparableSquare(1);
		System.out.println(a.compareTo(b));
		
		ArrayList<ComparableSquare> arr = new ArrayList<>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		//Collections.sort(arr);
		for(ComparableSquare s: arr){
			System.out.println(s.area);
		}
		
		
	}

}

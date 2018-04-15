package Java_11Lesson;

public class Rectangle {
	public int length;
	public int width;
	public int location_x;
	public int location_y;
	public Rectangle(int l, int w, int x, int y){
		length = l;
		width = w;
		location_x = x;
		location_y = y;
	}
	public int getWidth(){
		return width;
	}
	public void translate(int new_x, int new_y){
		location_x = new_x;
		location_y = new_y;
	}
	public static void main(String[] args) {
		//2.12b
		int width = new Rectangle(5, 10, 15, 20).getWidth();
		System.out.println(width);
		//2.12c
		Rectangle r = new Rectangle(5,10,15,20);
		r.translate(15, 25);
		//2.12d
		//r = new Rectangle();
		//r.translate("far, far away!");
		

	}
}

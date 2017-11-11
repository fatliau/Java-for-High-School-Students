package Java_2ndLesson;

public class objectRefernce {
	
	public static void main(String[] args) {
		Rectangle box1=new Rectangle(10,20);
		Rectangle box2=box1;
		System.out.println(box1.height+" "+box1.width);
		System.out.println(box2.height+" "+box2.width);
		box2.translate(30, 40);
		System.out.println(box1.height+" "+box1.width);
		System.out.println(box2.height+" "+box2.width);
	}
}

class Rectangle{
	int width;
	int height;
	
	public Rectangle(int w, int h){
		width=w;
		height=h;
	}
	
	public void translate(int w,int h){
		width=w;
		height=h;
	}
}

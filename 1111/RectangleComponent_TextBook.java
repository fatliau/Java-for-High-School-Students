package Java_2ndLesson;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class RectangleComponent_TextBook extends JComponent{

	public static void main(String[] args){
		JFrame frame = new JFrame();

		frame.setSize(300, 400);
		frame.setTitle("Two rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RectangleComponent_TextBook component = new RectangleComponent_TextBook();
		frame.add(component);

		frame.setVisible(true);
	}

	public void paintComponent(Graphics g){
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
	
		// Construct a rectangle and draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
	
		// Move rectangle 15 units to the right and 25 units down
		box.translate(15, 25);
	
		// Draw moved rectangle
		g2.draw(box);
	}
}

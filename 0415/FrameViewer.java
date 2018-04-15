package Java_11Lesson;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FrameViewer{

	public static void main(String[] args){

		JFrame frame = new JFrame();
		//• Double the frame size.
		//frame.setSize(200, 200);
		frame.setSize(400, 400);
		//• Change the greeting to “Hello, your name!”.
		JLabel label = new JLabel("Hello, World!");
		label.setBounds(5, 5, 50, 20);
		label.setOpaque(true);
		//• Change the background color to pale green (see Exercise P2.7).
		//label.setBackground(Color.PINK);
		label.setBackground(Color.GREEN);
		frame.add(label);
		//• For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)
		String imageLocation = "/Users/JC/Documents/eclipse/Tutor_Java/bin/Java_11Lesson/home-icon.png";
		JLabel icon = new JLabel(new ImageIcon(imageLocation)); 
		icon.setBounds(5, 30, 200, 200);
		frame.add(icon);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
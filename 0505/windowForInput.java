package Java_13Lesson;

import javax.swing.JOptionPane;

public class windowForInput {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter price:");
//		That method returns a String object. Of course, often you need the input as a number. Use
//		the Integer.parseInt and Double.parseDouble methods to convert the string to a number:
		double price = Double.parseDouble(input);
//		You can also display output in a dialog box:
		JOptionPane.showMessageDialog(null, "Price: " + price);
//		Finally, whenever you call the showInputDialog or showMessageDialog method in a program that
//		does not show any other frame windows, you need to add a line
		System.exit(0);
		
		
	}

}

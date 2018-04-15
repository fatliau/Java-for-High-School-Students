package Java_11Lesson;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class testImageIcon {


	public static void main(String[] args) throws Exception
	{
		//URL imageLocation = new URL("https://duke.dev.java.net/images/iconSized/duke.gif");
		String imageLocation = "/Users/JC/Documents/eclipse/Tutor_Java/bin/Java_11Lesson/home-icon.png";
		JOptionPane.showMessageDialog(null, "Hello", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
	}
}


package Java_11Lesson;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingTypingDisplay extends JFrame{

	JTextField userText;
	JLabel userLabel;
	
	public SwingTypingDisplay(){
		super("Typing and Dasply");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		init(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingTypingDisplay frame = new SwingTypingDisplay();
		
	}
	public void init(JPanel panel){
				
		panel.setLayout(null);
		
		userLabel = new JLabel("");
		userLabel.setBounds(10,30,80,40);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(10,10,100,20);
		panel.add(userText);
		
		TextFieldHandler handler = new TextFieldHandler();
		userText.addActionListener(handler);	
		
	}
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			if(event.getSource() == userText){
				string = String.format("typing:%s", event.getActionCommand());
			}
			userLabel.setText(string);
		}
	}
	
}

package Java_9thLesson;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class readTXT extends Application{
	
	public static void main(String[] args) throws FileNotFoundException{
		//launch(args);
		openJFile();
	}
	
	public static void openJFile() throws FileNotFoundException{
		JFileChooser chooser = new JFileChooser();
		Scanner sc = null;
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File selectedFile = chooser.getSelectedFile();
			sc = new Scanner(selectedFile);
		}
		int lineNumber = 1;
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println("/*"+lineNumber+"*/"+line);
			lineNumber++;
		}
		sc.close();
	}
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException{
		FileChooser chooser = new FileChooser();
		Scanner sc = null;
		
		File selectedFile = chooser.showOpenDialog(null);
		if(selectedFile != null){
			sc = new Scanner(selectedFile);
		}
		int lineNumber = 1;
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println("/*"+lineNumber+"*/"+line);
			lineNumber++;
		}
		sc.close();
	}
	

}

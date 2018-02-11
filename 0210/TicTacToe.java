package Java_8thLesson;
import java.util.Scanner;

public class TicTacToe {
	
	char[][] square;
	boolean endGame;
	boolean crossWin;
	
	public TicTacToe(){
		square = new char[3][3];
		for(int y=0;y<3;y++){
			for(int x=0;x<3;x++){
				square[y][x] = 'E';
			}
		}
		endGame = false;
		crossWin = false;
	}
	public boolean checkCross(char player){ //player: 'X', 'O'
		//check horozantal
		for(int y=0;y<3;y++){
			if(square[y][0] == player && square[y][1] == player && square[y][2] == player){
				return true;
			}
		}
		//check vertical
		for(int x=0;x<3;x++){
			if(square[0][x] == player && square[1][x] == player && square[2][x] == player){
				return true;
			}
		}
		//check diagonal "\"
		if(square[0][0] == player && square[1][1] == player && square[2][2] == player){
			return true;
		}
		//check diagonal "/"
		if(square[0][2] == player && square[1][1] == player && square[2][0] == player){
			return true;
		}
		return false;
	}
	public boolean checkFull(){
		for(int y=0;y<3;y++){
			for(int x=0;x<3;x++){
				if(square[y][x] == 'E'){
					return false;
				}
			}
		}
		return true;
	}
	public void printBoard(){
		System.out.println("Board:");
		for(int y=0;y<3;y++){
			for(int x=0;x<3;x++){
				System.out.print(square[y][x]);
			}
			System.out.println();
		}
	}
	public void setMove(char player, int y, int x){
		//TODO check player valid
		//TODO check are valid
		//TODO check empty
		square[y][x] = player;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean Xturn = true;
		TicTacToe game = new TicTacToe();
		while(game.endGame == false){
			game.printBoard();
			if(Xturn == true)
				System.out.println("It's X turn now:");
			else
				System.out.println("It's O turn now:");
			System.out.println("Please enter location: y x, 0<=y<=2,0<=x<=2");
			int y = sc.nextInt();
			int x = sc.nextInt();
			if(Xturn == true){
				game.setMove('X',y,x);
				if(game.checkCross('X')==true){
					System.out.println("X wins!!");
					game.endGame = true;
					break;//break the while
				}
			}
			else{
				game.setMove('O',y,x);
				if(game.checkCross('O')==true){
					System.out.println("O wins!!");
					game.endGame = true;
					break;//break the while
				}
			}
			if(game.checkFull()==true){
				System.out.println("It's a DRAW.");
				game.endGame = true;
				break;//break the while
			}
			if(Xturn == true)
				Xturn = false;
			else
				Xturn = true;
		}
		game.printBoard();
		sc.close();
	}
}
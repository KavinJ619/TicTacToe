package Lesson;
import java.util.*;
public class NewTry {
	
	
	public static int col,row, index;
	public static char[][] board = new char[3][3];
	public static Scanner scan = new Scanner(System.in);
	public static char turn = 'X';
	
	
	
	public static void main(String[] args){
		for (int i=0; i<3;i++){
			for (int j=0;j<3;j++){
				board[i][j] = '_';
			}
		}
		play();
	}
	
	
	
	
	
	public static void printboard(){
		for (int i=0; i<3;i++){
			System.out.println();
			for (int j=0;j<3;j++){
				if (j==0)
					System.out.print(" | ");
				System.out.print(board[i][j] + " | ");
			}
		}
		
	}
	
	
	
	
	
	public static boolean gameOver(int a, int b){
		if (board[0][b] == board[1][b] && board[0][b] == board[2][b])
			return true;
		if (board[a][0] == board[a][1] && board[a][0] == board[a][2])
			return true;
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2])
			return true;
		if (board[2][0] == board [1][1] && board [2][0] == board[0][2])
			return true;
		
		
		return false;
	}
	
	
	
	
	
	public static void play(){
		boolean playing = true;
		while (playing == true){
			row = scan.nextInt()-1;
			col = scan.nextInt()-1;
			board[row][col]=turn;
			
			if (gameOver(row,col)){
				playing = false;
				System.out.println("GameOver! Player "+turn+" Wins!");
			}
			printboard();
			if ( turn == 'X')
				turn='0';
			else
				turn = 'X';
			
			
		}
		
	}

	
	
	
	
}

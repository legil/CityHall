package weekfour;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	static char [][] board = new char [3][3];
	
	static String playerTurn;
	static String play;
	
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String [] args) {
		char [][] board = {{'1','2' ,'3'}, {'4','5','6'}, {'7','8','9'}};
		
		String slot = input.next();
		
		boolean turn;
		
		//display board
				System.out.println("+---+---+---+");
		        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
		        System.out.println("+---+---+---+");
		        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
		        System.out.println("+---+---+---+");
		        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
		        System.out.println("+---+---+---+");
		
		System.out.println("Please enter slot to mark (by row, col)");
		
		
		for(int i=0; i< 3; i++ ) {
			for(int j=0; j<3;j++) {
				
				if( i % 2 == 0) {
					turn = true;
				}
				
				while(turn = true) {
					System.out.println("Please enter slot to mark (by row, col)");
					slot = input.next();
							
				//switch; slot.parseInt if 0, ***slotposition = board[0,0]
					board[Integer.parseInt(slot)][j] = 'x';
					turn = false;
				}
				
				while (turn = false) {
					board[Integer.parseInt(slot)][j] = 'o';
					turn = true;
				}

				//switches to check if the rows are true
				
				board[0][0]= 'x';
				System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");	
			}
		}
	}	
}
		
		//play(playerturn); //find player turn, if 1 then X, if 2, then Y
		
		//displayboard();
		
		
		//Enum?
			


		        
		        /*for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board [i][j] = Integer.toString(board);
			}
			
		}
		*/
		
		//System.out.println(Arrays.deepToString(board));
		
		//turn%mod 2
		
		
		
		
		
		//display board
		//figure out 
		//switch to see if anyone has one
		//if tie, end program
		
		

package weekfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SBA2 {

	public static void main(String[] args) {
		
	/*
	 * 	Output: Display the possible moves of the knight: {3,3}, {5,3}, {2,3}, {6,2}
		Checkmate possible - Yes or No
		
		x1, y1, x2, y2, where 8>= x and y >=1
		knight and king cannot be in same position
	 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter coordinates of the knight: ");
		String knight = input.next();
		
		
		System.out.println("Please enter coordinates of the king: ");
		String king = input.next();
		
		String [][] board = new String [8][8];
		
		int xknight = (Integer.parseInt(knight.substring(0,1)));
		int yknight = (Integer.parseInt(knight.substring(2)));
		
		int xking =  (Integer.parseInt(king.substring(0,1)));
		int yking = (Integer.parseInt(king.substring(2)));
		
		if(xknight > 8 || xking > 8) {
			System.out.println("Illegal move: X coordinates cannot be greater than 8! \n");
		}
		
		if(yknight < 1 || yking < 1) {
			System.out.println("Illegal move: Y coordinates cannot be less than 1! \n");
		}
		
		if(xknight == xking && yknight == yking) {
			System.out.println("Error: Knight and king cannot be in same position!");
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = " _ "; 
				board[xknight-1][yknight-1] = " X ";
				board[xking-1][yking-1] = " X ";
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		
		boolean checkMate = false;
		boolean conditionsChecked = false;
		
		while(!conditionsChecked) {
			if(xknight-2 == xking && yknight-1 == yking) {
				checkMate = true;
			} 
			else if(xknight-2 == xking && yknight+1 == yking) {
				checkMate = true;	
			}
			else if(xknight-1 == xking && yknight+2 == yking) {
				checkMate = true;
			}
			else if(xknight+1 == xking && yknight+2 == yking) {
				checkMate = true;
			}
			else if(xknight+2 == xking && yknight-1 == yking) {
				checkMate = true;
			}
			else if(xknight+2 == xking && yknight+1 == yking) {
				checkMate = true;
			}
			else if(xknight-1 == xking && yknight-2 == yking) {
				checkMate = true;
			}
			else if(xknight+1 == xking && yknight-2 == yking) {
				checkMate = true;
			}
			
			conditionsChecked = true;
		}
		System.out.println("Possible moves of the knight: {" +
															(xknight -2)+ ", " + (yknight - 1) + "}, " + "{" + 
															(xknight -2)+ ", " + (yknight + 1) + "}, " + "{" +
															(xknight -1)+ ", " + (yknight + 2) + "}, " + "{" + 
															(xknight +1)+ ", " + (yknight + 2) + "}, " + "{" +
															(xknight +2)+ ", " + (yknight - 1) + "}, " + "{" + 
															(xknight +2)+ ", " + (yknight + 1) + "}, " + "{" +
															(xknight -1)+ ", " + (yknight - 2) + "}, " + "{" + 
															(xknight +1)+ ", " + (yknight - 2) + "}" );
		System.out.println("Checkmate possible? : " + (checkMate ? "Yes" : "No"));
	}
}


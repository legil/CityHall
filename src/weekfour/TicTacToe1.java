package weekfour;

import java.util.Scanner;

public class TicTacToe1 {
	private static Scanner scn = new Scanner(System.in);
	private static int turnCounter = 0;
	private static char[][] arr = { {'1', '2', '3'},
							{'4', '5', '6'},
							{'7', '8', '9'} };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;

		System.out.println("\n\nPlayer 1 is X.\nPlayer 2 is O." +
						   "\nYou will pick from cooridinates (1-9):");
		
		printBoard();
		
		int size = arr.length*arr.length;
		while(true) {
			//Get input & insert to array
			
			if(turnCounter%2 == 0) {
				System.out.print("\n\nPlayer 1 choose your coordinate: " );
				input = scn.nextInt();
				if((1 > input || input > 9) || !insert(arr, input) ) {
					System.out.println("Invalid input. Try again.");
					continue;
				}
				turnCounter++;
			}else if(turnCounter%2 == 1) {
				System.out.print("\n\nPlayer 2 choose your coordinate: " );
				input = scn.nextInt();
				if((1 > input || input > 9) || !insert(arr, input)) {
					System.out.println("Input not valid. Try again.");
					continue;
				}
				turnCounter++;
			}
			
			printBoard();
			
			//Check for winner or draw
			if(winner() || diagonal()) {
				System.out.print("\nWINNER!!! ");
				playAgain();
				printBoard();
			}else if(turnCounter == size) {
				System.out.println("\nDRAW!!! ");
				playAgain();
				break;
			}
		}

	}

	//Prints board
	private static void printBoard() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(j == 0)
					System.out.printf(" %C", arr[i][j]);
				else if(j == arr.length-1)
					System.out.printf("%C ", arr[i][j]);
				else 
					System.out.printf(" | %C | ", arr[i][j]);		
			}
			if(i < arr.length-1)
				System.out.print("\n---|---|---\n");
		}
	}
	
	//Check horizontal and vertical win conditions
	private static boolean winner() {
		for(int r = 0; r < arr.length; r++) {
			String vertical = "";
			String horizontal = "";
			for(int c = 0; c < arr[0].length; c++) {
				horizontal += arr[r][c];//Obtains horizontal elements
				vertical += arr[c][r]; //Obtains vertical elements
			}
			//Checks for matching win conditions
			if(horizontal.equals("XXX") || horizontal.equals("OOO")) { 
				return true;
			}else if(vertical.equals("XXX") || vertical.equals("OOO")){
				return true;
			}
		}
		return false;
	}
	
	//check both diagonal win conditions
	private static boolean diagonal() {
	    if ((arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') ||
	        (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X'))
	    {
	    	return true;
	    }
	    else return (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') ||
				(arr[2][0] == 'O' && arr[1][1] == 'O' && arr[0][2] == 'O');
	}
	//Inserts the appropriate characters for the grid to be printed
	private static boolean insert(char[][] arr, int n) {
		int count = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[0].length; j++) {
				if((count == n-1) && (turnCounter%2 == 0) && (arr[i][j] != 'X' && arr[i][j] != 'O')) {
					arr[i][j] = 'X';
					return true;
				}else if((count == n-1) && (turnCounter%2 == 1) && (arr[i][j] != 'X' && arr[i][j] != 'O')) {
					arr[i][j] = 'O';
					return true;
				}else {
					count++;
				}
			}
		return false;
	}
	
	private static void playAgain() {
		while(true) {
			System.out.print("\nDo you want to play again? (y/n) \n");
			String choice = scn.next().toLowerCase();
			switch(choice) {
				case "y":
					turnCounter = 0;
					resetBoard();
					return;
				case "n":
					System.out.println("\nTHANKS FOR PLAYING!");
					System.exit(0);
				default:
					System.out.println("Incorrect input. Try again.\n");
					break;
			}
		}
	}

	private static void resetBoard(){
		arr = new char[][]{{'1', '2', '3'},
				{'4', '5', '6'},
				{'7', '8', '9'} };
	}
}

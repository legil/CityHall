package weekfour;

import java.util.Scanner;

public class AirplaneBooking {
	
	private static int duplicates = 0;
	private static int counter = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String booked = "A4, A10, C5, D3, E6, F8"; //example from the assignment page
		//System.out.print("Please enter seat numbers that are already booked: ");
		System.out.printf("Please enter seat numbers that are already booked:\n%S \n", booked);
		
		String[][] seats = new String[26][12]; //all seats
//		String[] bookedSeats = input.nextLine().toUpperCase().split(", "); // user input seats booked
		String[] bookedSeats = booked.split(", ");
		char[] row = new char[bookedSeats.length]; //this array will hold the row letters from A-Z
		int[] column = new int[bookedSeats.length]; //this array will hold the column numbers from 1-10
		int[] position = new int[bookedSeats.length]; //Stores rows where people are seated.
	
		int count = 0; 
		for(String x: bookedSeats) { //enhanced for loop to iterate over the string elements in bookedSeats array
			column[count] = Integer.parseInt(x.replaceAll("[A-Z]", "")); //replace all characters with "" to get digits
			row[count] = x.replaceAll("[0-9]+", "").charAt(0); //replace all digits with "" and take the first element as chat
			count++;
		}
		
		//Populate the array
		for (int i = 0; i < seats.length; i++)//row
			for (int j = 0; j < seats[i].length; j++)//col
				if (j == 3 || j == 8) 
					seats[i][j] = " "; //spaces represent aisles
				else
					seats[i][j] = "O"; //represent seats not taken
		
		printGrid(seats); //Prints grid
		insert(row, column, seats, position); //Marks seats with an X on grid to represent occupied
		printGrid(seats); //Prints grid
		removeDuplicates(position); //Removes duplicate rows from position
		int families = tickets(seats, position);
		System.out.printf("\nNumber of families: %d", families); //Number of families that can be seated
		System.out.printf("\nNumber of tickets: %S", families*3); //total number of tickets = 3* number of families
		
		input.close();
	}	

	
	private static void insert(char[] row, int[] col, String[][] seats, int[] position) {
		int size = row.length;
		for(int i = 0; i < size; i++)
			if(col[i] >= 8) {
				seats[row[i]-65][col[i]+1] = "X"; //adjust the seat @ second aisle by one to the right (so add 1)
				storeRow(position, i, row[i]-65);
			}else if(col[i] <= 3){
				seats[row[i]-65][col[i]-1] = "X"; //adjust the seat @ first aisle by one to the left (so subtract 1)
				storeRow(position, i, row[i]-65);
			}else{
				seats[row[i]-65][col[i]] = "X"; //otherwise just set the seat at the specified indices
				storeRow(position, i, row[i]-65);
			}
	}
	
	//Stores the rows with any occupants for later use.
	//Will contain duplicates if more than one person is in a row.
	private static void storeRow(int[] position, int count, int row) 
	{ position[count] = row; }
	
	//A family consists of 3 people and can sit together for every "OOO".
	//Empty row is equivalent to 3 families.
	//Rows with occupants must be checked.
	private static int tickets(String[][] seats, int[] position) {
		int occupied = duplicates;
		System.out.println("Rows with occupants:");
		for(int i = 0; i < occupied; i++) {
			String temp = "";
			
			for(int j = 0; j < seats[0].length; j++) 
				temp += seats[position[i]][j];
			System.out.println(temp);
			String family = "";
			//Iterate through row and check for matches of "OOO"
			for(int c = 0 ; c < temp.length(); c++) {
				//Get sub strings that don't include a space
				//EX: "XOO OOOO OOO" ---> "XOO" "OOOO" "OOO"
				if(temp.charAt(c) != ' ') {
					family+=temp.charAt(c);
					if(family.length()%3 == 0 && family.contains("OOO")) { 
						counter++;
						family ="";
					}
				}
		
			}
		}
		//Any empty rows can seat 3 families 
		int emptyRows = (26 - occupied)*3;
		counter += emptyRows;
		return counter;
	}
	
	private static void removeDuplicates(int[] position) {
		int[] dupesRemoved = new int[position.length]; //new array without the duplicate rows
		int j = 0; //this will count the number of rows we need to consider
		for(int i = 0; i < position.length - 1; i++) {
			if(position[i] != position[i+1]) { //if not a duplicate then put into the new array
				dupesRemoved[j++] = position[i];
			}
		}
		dupesRemoved[j++] = position[position.length - 1]; //add the last non duplicated element
		duplicates = j; //this means the number of rows that we are checking
		for(int i = 0; i < j; i++) {
			position[i] = dupesRemoved[i]; //copy over the elements back into the array that are not duplicates (dupes at end)
		}
	}
	
	private static void printGrid(String[][] seats) {
		int alpha = 65; //will represent the lettered row
		
		System.out.print("\n  ");
		//Prints 
		for(int n = 1; n < 11 ; n++) {
			if(n == 8 || n == 4)
				System.out.printf(" | %d", n);
			else
				System.out.printf(" %d", n);
		}
		System.out.println();
		for (int i = 0; i < seats.length; i++) {
			System.out.printf("%C: ", (char) alpha++); //lettered row: ...
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " "); //print the seat followed by spacing
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
package weekthree;

public class DeckOfCards {
	public static void main(String[] args) {

		int[] deck = new int[52]; //initialize deck
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for(int i = deck.length - 1; i > 0; i--) {  //randomize deck array 
			//Generate an index j randomly with 0 <= j <= i
			int random = (int)(Math.random() * (i + 1));
	
			//swap myList[i] with myList[j]
			int temp = deck[i]; //swap
			deck[i] = deck[random];
			deck[random] = temp;
		}
		
		
		for (int i = 0; i < 4; i++) {//repeat process for 4 draws
			int pulledCard= deck[i]; //draw first 4 elements in randomized array
			
			int cardNum = (pulledCard % 13) + 1; //assign the drawn card its actual number in deck ( 1 - 52)
			String rank  = "";
			int cardType = pulledCard / 13; //assign suit by number 0 - 3 (4 groups)
			
			switch(cardNum) { //Assign rank based on the number out of 13
			case 1: 
				rank = "Ace";
				break;
			case 2:
				rank= "2";
				break;
			case 3:
				rank= "3";
				break;
			case 4:
				rank= "4";
				break;
			case 5:
				rank= "5";
				break;
			case 6: 
				rank= "6";
				break;
			case 7:
				rank= "7";
				break;
			case 8:
				rank= "8";
				break;
			case 9:
				rank= "9";
				break;
			case 10:
				rank= "10";
				break;
			case 11:
				rank= "Jack";
				break;
			case 12:
				rank= "Queen";
				break;
			case 13:
				rank= "King";
				break;
			}	
			
			switch(cardType) { //Tells which suit this rank is in
			case 0: System.out.println("Your card is " + rank+ " of Spades");
				break;
			case 1: System.out.println("Your card is " + rank+ " of Hearts");
				break;
			case 2: System.out.println("Your card is " + rank+ " of Diamonds");
				break;
			case 3: System.out.println("Your card is " + rank+ " of Clubs");
				break;
			}
		}
	}
}



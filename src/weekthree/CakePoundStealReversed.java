package weekthree;

import java.util.Arrays;

public class CakePoundStealReversed {
	public static void main(String[] args) {
		char[] message = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
		reverseLetters(message);
		//System.out.println(message);
	}
	
	public static void reverseLetters(char[] msg) {
		char[] newMsg = new char[msg.length];
		
		for(int i = 0; i < msg.length; i++) {  //assigns spaces based on position in original []
			if(msg[i] == ' ') {
				newMsg[i] = ' '; //msg[i]
			}
		}
		
		System.out.println(Arrays.toString(newMsg));
		//try initializing int i and taking out the outer loop?
		
	//for(int i = msg.length-1, j = 0; i >=0 || j < newMsg.length; i--, j++) { //trace - reverses with spaces but only adds 4 chars
		
		for(int i = msg.length-1; i >= 0; i--) { //for every i, j runs. should i separate this loop?
			for(int j = 0; j < newMsg.length; j++) {
				if(msg[j] != ' ') {
					newMsg[j] = msg[i];
				}
				else if(newMsg[j] == ' ') {
					newMsg[j+1] = msg[i];
				}
			}
		}
		System.out.println(newMsg);
		
		
		
		
		
	}
}
		

//how can i solve this?
//things to keep track of: index of Spaces?

		
		
		/*String result = "";
		String word = "";
		
		for(int i = msg.length-1; i >= 0; i--) {
			if(msg[i] != ' ') {
				word += msg[i];
			}
			
			if(msg[i] == ' ' || i == 0) {
				for(int j = word.length() - 1; j >= 0; j--) {
					result += word.charAt(j);
				}
				result += " ";
				word = "";
			}
			
		}
		
		for(int i = 0; i < result.length() - 1; i++) {
			msg[i] = result.charAt(i);
		}
		*/

		

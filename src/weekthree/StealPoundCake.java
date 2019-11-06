package weekthree;

public class StealPoundCake{
	public static void main(String[] args) {
		char[] c = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
		reverseWords(c);
	}
	
	public static void reverseWords(char[] c) {
		String message= new String(c); //convert char array to string
		message = " " + message; // add space in front of string
		//System.out.println(c);
		String reversed = "";
		
		for(int i = message.length()-1; i >= 0; i--) { //traverse string backwards
			if(message.charAt(i) == ' ') { //if i is an empty space
				reversed = reversed + message.substring(i, i + 6); //add (space + 1) + 4 chars
			}
		}
		
		System.out.println(reversed.trim());
	}
}
			
	
	

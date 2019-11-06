package weekseven;

public class Elfish {
	public static void main(String [] args) {
		System.out.println(elfish("waffles"));
		
	}
	
	static boolean elfish(String str) {
		
		String elf = "";
		boolean elfish = false;

		
		if(str.isEmpty()) {
			return elfish;
		}
		else {
			/*
			for(int i = 0; i < str.length(); i++) {
				if(str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'l' || str.toLowerCase().charAt(i) == 'f') {
					elf += str.charAt(i);
				}
			}
			*/
			if(str.contains("e") && str.contains("l") && str.contains("f")) {
				elfish = true;
			}
		
		}	
		return elfish;
	}
}

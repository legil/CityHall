package weekseven;

public class Xish {
	public static void main(String[] args) {
		String elf = "";
		String str  = "";
		
		int res = elfish("elf", "waffles");
		if(res == str.length()) {
			System.out.println("elfish");
		}
		else { 
			System.out.println("not elfish");
	}
}
  
		
	
	static int elfish(String elf, String str) {
		int count = 0;
		
		if(elf.length() == 0) { //base condition
			return 0;
		}
		else if(str.contains(elf.substring(0,1))){
			count++;
			System.out.println("Inside of conditions: " + count);
			return count + elfish(elf.substring(1), str);
		}
		System.out.println("Outside of conditions: " + count);
		return count;
	}
}

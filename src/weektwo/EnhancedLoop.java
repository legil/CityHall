package weektwo;

public class EnhancedLoop {
	public static void main(String[] args) {
		String[] names = {"Max", "Lucy" , "Tom"};
		
		for(String name: names) {
			name = name.concat("just to print");
			System.out.println(name);
		}
		
		
		
		
	}

}

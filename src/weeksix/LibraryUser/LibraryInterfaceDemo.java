package weeksix.LibraryUser;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUser k1 = new KidUser();
		KidUser k2 = new KidUser();
		
		k1.setAge(10);
		k1.registerAccount();
		k2.setAge(18);
		k2.registerAccount();
		
		k1.setBookType("Kids");
		k1.requestBook();
		k2.setBookType("Fiction");
		k2.requestBook();
		
		System.out.println();
		
		AdultUser a1 = new AdultUser();
		AdultUser a2 = new AdultUser();
		a1.setAge(5);
		a1.registerAccount();
		a2.setAge(23);
		a2.registerAccount();
		
		a1.setBookType("Kids");
		a1.requestBook();
		a2.setBookType("Fiction");
		a2.requestBook();
		
	}

}

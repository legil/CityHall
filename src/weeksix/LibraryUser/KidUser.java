package weeksix.LibraryUser;

public class KidUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	/*
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	*/
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(age < 12) {
			System.out.println(age + ": You have successfully registered under a kids account.");
		} else {
			System.out.println(age + ": Sorry, age must be less than 12 to register as a kid.");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType == "Kids") {
			System.out.println(bookType + ": Book issued successfully, please return the book within 10 days.");
		} else {
			System.out.println(bookType + ": Oops, you are only allowed to take only kids books");
		}
		
	}

}

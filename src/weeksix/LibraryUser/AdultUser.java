package weeksix.LibraryUser;

public class AdultUser implements LibraryUser {
	
	private int age;
	private String bookType;

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
		if(age > 12) {
			System.out.println( age + ": You have successfully registered under an Adult account.");
		} else {
			System.out.println(age + ": Sorry, age mmust be greater than 12 to register as an adult.");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType == "Fiction") {
			System.out.println(bookType + ": Book issed successfully, please return the book within 7 days.");
		} else {
			System.out.println(bookType + ": Oops, you are only allowed to take out only adult Fiction books. ");
		}
		
	}

}

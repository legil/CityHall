package weekfour;

//import weekfive.Class1;
import weekfive.Student;
import weekfive.Person;

public class Class2 {
	public static void main(String [] args) {
		//Class1 test = new Class1();
		//test.setAge(22);
		
		//System.out.println(test.getAge());
		
		Student john = new Student(123456, "John", "Smith", "123-456-7890");
		john.setPhone("098-456-1234");
		System.out.println(john.getPhone());
		System.out.println(john.toString());
		
		System.out.println();
		
		
		System.out.println("Person A: " + Person.getA());
		Person.setA("New A Name"); //A is static so changes for all a in class
		System.out.println("Person A's new name: " + Person.getA());
		
		Person person = new Person();
		System.out.println("Person B: " + person.getB());
		person.setB("New B name");
		System.out.println("Person B's new name: " + person.getB());
		
		
		
		
	}
}

package weekfive;

public class StudentData {
	public static void main(String [] args) {
		MathMajor ms1 = new MathMajor(1, "Max", 2, 3, true);
		Student2 s1 = new MathMajor(1, "Max", 2, 3, true);
		Student2 s = new Student2(1, "Max", 3);
		
		//MathMajor mm = new Student2(2, "Lucy", 2); //can't happen because parent class to child class but can cast in reverse order                                                  
		Student2 mm = (Student2) new MathMajor(2, "Lucy", 2, 3, true); //assigned as as math major but keeps only its original parent properties
		
		
		s1.setCollegeName("PQR");
		System.out.println(ms1.getCollegeName());
		System.out.println(ms1.getGPA());
		
		ms1.practiceLab();
		ms1.useLibrary();

		
		((MathMajor) s1).practiceLab();
		s1.useLibrary();
		
		System.out.println("====================================================");
		
		MathMajor mms = new MathMajor(1, "Lucy", 2, 3, true);
		mms.useLibrary();
		mms.ancestor();
		mms.useLibrary("math!");
		
		
		Student2 stu = new MathMajor(1, "Lucy", 2, 3, true);
		s.useLibrary();
		((MathMajor) stu).practiceLab();
		
		Student2 stu2 = new Student2(1, "Lucy", 3);
		s.useLibrary();
		//((MathMajor) s).practiceLab();//cant cast student to math major child -> parent
		
		
		
		PhysicsMajor pms = new PhysicsMajor(1, "Lucy", 3, true);
		pms.useLibrary();
		pms.useLibrary("physics!");
		pms.invokeGeek();
		PhysicsMajor.geekProducer();
	}
}

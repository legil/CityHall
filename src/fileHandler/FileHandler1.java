package fileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler1 {
	public static void main(String[] args) {

		try {
			String location = "src/fileHandler/courses.txt";
			File file = new File(location);
			Scanner input = new Scanner(file);
			ArrayList<Course> data = new ArrayList<Course>();

			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(", ");
				data.add(new Course(line[0], line[1], line[2]));
			}

			for (Course course : data) {
				System.out.format("%-15s | %-35s | %-25s\n",
							course.getCourseID(), course.getCourseName(), course.getInstructor());
			}
			
			
			FileWriter writer = new FileWriter(file, true);
			Course course = new Course("CIS335", "Advanced OOP", "Bairon V.");
			writer.write(String.format("%s, %s, %s\n", course.getCourseID(), course.getCourseName(), course.getInstructor()));
			
			writer.close();

		} catch (IOException e) {
			System.out.println("File Not Found!");

		}
	}
}

package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class App {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(100, 25, "tom"));
		students.add(new Student(98, 21, "bar"));
		students.add(new Student(34, 30, "shay"));
		students.add(new Student(84, 36, "nil"));
		students.add(new Student(17, 41, "luke"));

		System.out.println(students);
		Collections.sort(students, new sortAge());
		System.out.println(students);
		Collections.sort(students, new sortGrade());
		System.out.println(students);
		Collections.sort(students, new sortName());
		System.out.println(students);

	}
}

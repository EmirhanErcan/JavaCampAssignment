package homework
;
public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# + ANGULAR", "Engin DEMIROG");
		Course course2 = new Course(2, "JAVA + REACT", "Engin DEMIROG");
		Course course3 = new Course(3, "Introduction of Programming", "Engin DEMIROG");

		Student student1 = new Student(1, "Name SURNAME", "abc@abc.com");
		Student student2 = new Student(2, "Full Name SURNAME", "cba@cba.com");

		Student[] students = { student1, student2 };

		Course[] courses = { course1, course2, course3 };

		System.out.println("Student list: ");

		for (Student student : students) {
			System.out.println(student.fullName);
		}

		System.out.println("<----------------------------->");

		System.out.println("Courses list: ");

		for (Course course : courses) {
			System.out.println(course.name);
		}

		System.out.println("<----------------------------->");

		CourseManager courseManager = new CourseManager();

		courseManager.addEnroll(student1, course2);
		courseManager.addEnroll(student2, course1);

		System.out.println("<----------------------------->");

		courseManager.deleteEnrollment(student1);

	}

}

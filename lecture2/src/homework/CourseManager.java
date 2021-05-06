package homework;

public class CourseManager {
	
	public void addEnroll(Student student, Course course) {
		System.out.println(
				student.fullName + " enrolled the course : " + course.name + " given by " + course.instructor);
	}

	public void deleteEnrollment(Student student) {
		System.out.println("Student's course enrollment deleted: " + student.fullName);
	}

}

package homework;

public class InstructorManager extends UserManager{
	
	
	public void addCourse(Instructor instructor) {
		System.out.println("New course added to system by " + instructor.getFullName());

	}
	
	
	public void updateCourse(Instructor instructor) {
		System.out.println("Course updated by " + instructor.getFullName());

	}
	
	
	public void deleteCourse(Instructor instructor) {
		System.out.println("Course deleted from system by " + instructor.getFullName());

	}	

}

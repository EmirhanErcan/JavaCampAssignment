package homework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFullName("Emirhan ERCAN");
		student.seteMail("abc@abc.com");
		student.setEnrolledCourse("JAVA + REACT");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFullName("Engin DEMÝROG");
		instructor.seteMail("cba@cba.com");
		instructor.setGivenCourses("JAVA + REACT, C# + ANGULAR");
		
		User[] users = {student, instructor};	
		
		UserManager userManagers = new UserManager();
		userManagers.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.enrollToCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.updateCourse(instructor);
		

	}

}

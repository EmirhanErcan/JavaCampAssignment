package homework;

public class StudentManager extends UserManager{
	
	public void enrollToCourse(Student student) {
		System.out.println(student.getFullName() + " enrolled to course");
	}

}

package homework;

public class Student extends User{

	private String enrolledCourse;
	


	public Student() {
		super();
	}

	public Student(int id, String fullName, String eMail,String enrolledCourse) {
		super(id, fullName, eMail);
		this.enrolledCourse = enrolledCourse;
		
	}

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	
}

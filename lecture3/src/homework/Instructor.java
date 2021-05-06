package homework;

public class Instructor extends User{

	private String givenCourses;
	
	
	

	public Instructor() {
		super();
	}

	public Instructor(int id, String fullName, String eMail, String givenCourses) {
		super(id, fullName, eMail);
		this.givenCourses = givenCourses;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	
	

}

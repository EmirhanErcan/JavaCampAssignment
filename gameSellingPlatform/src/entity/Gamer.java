package entity;

import abstracts.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationaltyId;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, int birthYear, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	

}

package entity;

import abstracts.Entity;

public class Campaign implements Entity{
	
	private String description;
	private double discount;

	public Campaign() {
		super();
	}

	public Campaign(String description, double discount) {
		super();
		this.description = description;
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	

}

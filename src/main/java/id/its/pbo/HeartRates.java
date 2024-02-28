package id.its.pbo;

import java.time.LocalDate;

public class HeartRates {
	String firstName,lastName;
	int day,month,year;
	
	public HeartRates(String firstName, String lastName, int day, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public LocalDate getBirthDate() {
		return LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
	}
	
	public int getAge() {
		return 2021 - this.getYear();
	}
	public Double getMaxHeartRate() {
		return 220.0 - getAge();
	}
	public Double getLowerRangeHeartRate() {
		return getMaxHeartRate() * 50/100;
	}
	public Double getUpperRangeHeartRate() {
		return getMaxHeartRate() * 85/100;
	}

}

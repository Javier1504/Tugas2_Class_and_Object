package id.its.pbo;

public class HealthProfile {
	String firstName,lastName,Gender;
	int day,month,year;
	double height,weight;
	
	public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.Gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}
	
	public int getAge(int day, int month, int year) {
		return 2021 - year;
	}
	public void setBirthDay (int day) {
		this.day = day;
	}
	public void setBirthMonth(int month) {
		this.month = month;
	}
	public void setBirthYear (int year) {
		this.year = year;
	}
	public double getMaxHeartRate() {
		return 220 - this.getAge(this.day, this.month, this.year);
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getTargetHeartRate() {
		return (int)Math.ceil(getMaxHeartRate() * 50/100) + " - " +  (int)Math.ceil(getMaxHeartRate() * 85/100);
	}
	public double BMI () {
		return (700 * this.weight) / (this.height * this.height);
	}
}
package id.its.pbo;

public class Employee {

	String firstName,lastName;
	Double monthlySalary;
	
	public Employee(String firstName, String lastName, Double monthlySalary) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
		else
			this.monthlySalary = 0.0;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Double getMonthlySalary() {
		return this.monthlySalary;
	}
	
	public Double getYearlySalary() {
		return this.monthlySalary * 12;
	}
	
	public void raiseSalary() {
		this.monthlySalary += this.monthlySalary * 10/100;
	}
}
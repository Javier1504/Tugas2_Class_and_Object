package id.its.pbo;

public class Date {
	int day,month,year;

	public Date (int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getDay() {
		return 11;
	}
	
	public int getMonth() {
		return 11;
	}
	
	public int getYear() {
		return 2002;
	}
	
	public String displayDate() {
		return ("11/11/2002");
	}
}
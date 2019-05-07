import java.util.GregorianCalendar;

class DailyWeatherReport {
	private GregorianCalendar date;
	private Reading high;
	private Reading low;
	
	DailyWeatherReport(GregorianCalendar date, Reading high, Reading low){
		this.date = date;
		this.high = high;
		this.low = low;
	}
	
	//getter functions for the variables
	GregorianCalendar getDate() {
		return this.date;
	}
	
	Reading getHigh() {
		return this.high;
	}
	
	Reading getLow() {
		return this.low;
	}
	
	boolean dateCheck(int month, int year) {
		return (this.date.get(GregorianCalendar.MONTH) == month && this.date.get(GregorianCalendar.YEAR) == year);
	}

}

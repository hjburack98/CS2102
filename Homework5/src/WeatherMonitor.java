import java.util.GregorianCalendar;
import java.util.LinkedList;

class WeatherMonitor{
	private IDailyReport aWeatherReport;
	
	WeatherMonitor(IDailyReport aWeatherReport){
		this.aWeatherReport = aWeatherReport;
	}
	
	//Takes a month and a year of the IWeatherReport
	//runs the averageHighReportMonth method from DailyReportSet
	//return the average high temperature for weather reports in the given month and year
	public double averageHighPerMonth(int aMonth, int aYear) {
		return aWeatherReport.averageHighReportMonth(aMonth, aYear);
	}
	
	//takes a month and a year of the IWeatherReport
	//return average low temperature for weather reports in the given month and year
	public double averageLowPerMonth(int aMonth, int aYear) {
		return aWeatherReport.averageLowReportMonth(aMonth, aYear);
	}
	
	//takes a date and a list of readings from that day
	//runs the addDailyReport method from DailyReportSet
	//add the resulting reading to the IWeatherReport
	public void addDailyReport(GregorianCalendar aDate, LinkedList<Reading> dateReading){
		this.addDailyReport(aDate, dateReading);
	}

}

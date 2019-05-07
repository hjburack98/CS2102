import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

public class Examples {
	
	Reading r1 = new Reading (new Time(15, 45), 50);
	Reading r2 = new Reading (new Time(2, 10), 46);
	Reading r3 = new Reading (new Time(14, 30), 65);
	Reading r4 = new Reading (new Time(4, 45), 50);
	Reading r5 = new Reading (new Time(13, 10), 50);
	Reading r6 = new Reading (new Time(4, 9), 40);
	Reading r7 = new Reading (new Time(12, 50), 51);
	Reading r8 = new Reading (new Time(3, 20), 43);
	
	Reading r9 = new Reading (new Time(15, 10), 47);
	Reading r10 = new Reading (new Time(1, 59), 14);
	
	DailyWeatherReport report1 = new DailyWeatherReport(new GregorianCalendar(2016, 11, 17), r1, r2);
	DailyWeatherReport report2 = new DailyWeatherReport(new GregorianCalendar(2016, 11, 18), r3, r4);
	DailyWeatherReport report3 = new DailyWeatherReport(new GregorianCalendar(2016, 8, 25), r5, r6);
	DailyWeatherReport report4 = new DailyWeatherReport(new GregorianCalendar(2017, 11, 2), r7, r8);
	
	GregorianCalendar addedDate = new GregorianCalendar(2017, 1, 5);
	DailyWeatherReport report5 = new DailyWeatherReport(addedDate, r9, r10);
	
	LinkedList<DailyWeatherReport> weatherReports = new LinkedList<DailyWeatherReport>();
	LinkedList<DailyWeatherReport> addedWeatherReport = new LinkedList<DailyWeatherReport>();
	
	LinkedList<Reading> newReadings = new LinkedList<Reading> ();
	


	public Examples() {
		//setting up testing for averageHigh and averageLow
		weatherReports.add(report1);
		weatherReports.add(report2);
		weatherReports.add(report3);
		weatherReports.add(report4);
		
		//setting up testing for adding new report
		addedWeatherReport.add(report1);
		addedWeatherReport.add(report2);
		addedWeatherReport.add(report3);
		addedWeatherReport.add(report4);
		addedWeatherReport.add(report5);
		
		newReadings.add(r2);
		newReadings.add(r6);
		newReadings.add(r9);
		newReadings.add(r10);
		newReadings.add(r8);
	}
	
	DailyReportSet reportSet = new DailyReportSet(weatherReports);
	DailyReportSet addedReportSet = new DailyReportSet(addedWeatherReport);
	
	WeatherMonitor aMonitor = new WeatherMonitor(reportSet);
	
	
	//testing average high method for multiple entries
	@Test
	public void averageHighDecember2016() {
		assertEquals(57.5, aMonitor.averageHighPerMonth(11, 2016), 0.1);
	}
	
	//testing average high method for entries of same month but different year
	@Test
	public void averageHighDecember2017() {
		assertEquals(51.0, aMonitor.averageHighPerMonth(11, 2017), 0.1);
	}
	
	
	//testing average high method for entry of same year but different month
	@Test
	public void averageHighSeptember2016() {
		assertEquals(50, aMonitor.averageHighPerMonth(8, 2016), 0.1);
	}
	
	
	//testing average low method for multiple entries
	@Test
	public void averageLowDecember2016() {
		assertEquals(48, aMonitor.averageLowPerMonth(11, 2016), 0.1);
	}
	
	//testing average low method for entry of same month but different year
	@Test
	public void averageLowDecember2017() {
		assertEquals(43, aMonitor.averageLowPerMonth(11, 2017), 0.1);
	}
	
	
	//testing average low method for entry of same year but different month
	@Test
	public void averageLowSeptember2016() {
		assertEquals(40, aMonitor.averageLowPerMonth(8, 2016), 0.1);
	}
	

	
	
	
}

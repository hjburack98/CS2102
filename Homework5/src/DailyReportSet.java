import java.util.GregorianCalendar;
import java.util.LinkedList;

class DailyReportSet implements IDailyReport{
	private LinkedList<DailyWeatherReport> aWeatherReport;
	
	DailyReportSet(LinkedList<DailyWeatherReport> aWeatherReport){
		this.aWeatherReport = aWeatherReport;
	}

	//takes a GregorianCalendar and a LinkedList of Readings
	//creates a new DailyWeatherReport for the highest and lowest temperature reports
	//adds the new DailyWeatherReport to the existing DailyReportSet
	public void addReport(GregorianCalendar aDate, LinkedList<Reading> dateReading) {
		int dateHigh = Integer.MIN_VALUE;
		int dateLow = Integer.MAX_VALUE;
		Reading highReading = null;
		Reading lowReading = null;
		
		for(Reading aReading : dateReading) {
			if(aReading.getTemp() > dateHigh) {
				dateHigh = aReading.getTemp();
				highReading = aReading;
			}
			
			if(aReading.getTemp() < dateLow) {
				dateLow = aReading.getTemp();
				lowReading = aReading;
			}
		}
		
		DailyWeatherReport newDateReading = new DailyWeatherReport(aDate, highReading, lowReading);
		this.aWeatherReport.add(newDateReading);
		
	}
	
	//takes two integers for a month and year
	//return the average low temperature for weather reports in the given month and year
	public double averageLowReportMonth(int aMonth, int aYear) {
		int numOfReadings = 0;
		double averageLowTemp = 0;
		
		for(DailyWeatherReport d: this.aWeatherReport)
		{
			if(d.dateCheck(aMonth, aYear) == true) 
			{				
				averageLowTemp = averageLowTemp + d.getLow().getTemp();
			}
		}
		
		for(DailyWeatherReport d : this.aWeatherReport) {
			if(d.dateCheck(aMonth, aYear) == true) 
			{
				numOfReadings = numOfReadings + 1;
			}
		}
		
		averageLowTemp = averageLowTemp / numOfReadings;
		return averageLowTemp;
		
		
	}
	
	//takes two integers for a month and a year
	//return the average high temperature for weather reports in the given month and year
	public double averageHighReportMonth(int aMonth, int aYear) {
		int numOfReadings = 0;
		double totalHighTemp = 0;
		double averageHighTemp = 0;
		
		for(DailyWeatherReport d: this.aWeatherReport)
		{
			if(d.dateCheck(aMonth, aYear) == true) 
			{
				
				totalHighTemp = totalHighTemp + d.getHigh().getTemp();
				numOfReadings = numOfReadings + 1;
			}
		}
		
		averageHighTemp = totalHighTemp*1.0 / numOfReadings;
		return averageHighTemp;
		
		
	}
	
}

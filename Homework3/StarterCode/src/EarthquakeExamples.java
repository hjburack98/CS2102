import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  Earthquake2 E2 = new Earthquake2();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> fourDates = new LinkedList<Double>();  
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> OctReport = new LinkedList<MaxHzReport>();
  
  public EarthquakeExamples() {
    fourDates.add(20151013.0);
    fourDates.add(10.0);
    fourDates.add(5.0);
    fourDates.add(20151020.0);
    fourDates.add(40.0);
    fourDates.add(50.0);
    fourDates.add(45.0);
    fourDates.add(20151101.0);
    fourDates.add(6.0);
    fourDates.add(6.2);
    fourDates.add(20151104.0);
    fourDates.add(7.8);
    NovReports.add(new MaxHzReport(20151101.0, 6.2));
    NovReports.add(new MaxHzReport(20151104.0, 7.8));
    OctReport.add(new MaxHzReport(20151013.0, 10.0));
    OctReport.add(new MaxHzReport(20151020.0, 50.0));
  }

  @Test
  public void testEQ1() { 
	 
    assertEquals(OctReport, 
                 E1.dailyMaxForMonth(fourDates, 10));
    
  }
  
  @Test
  public void testEQ2() {
	  assertEquals(OctReport, E2.dailyMaxForMonth(fourDates, 10));
  }

}

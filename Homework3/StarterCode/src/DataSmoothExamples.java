import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
  LinkedList<Show> shows = new LinkedList<Show>();
  LinkedList<Double> showResults = new LinkedList<Double>();
  DataSmooth1 D1 = new DataSmooth1();
  DataSmooth2 D2 = new DataSmooth2();
  
  public DataSmoothExamples() 
  {
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Rogue Air", 42));
		eps1.add(new Episode("Legends of Today", 43));
		eps1.add(new Episode("Invasion", 44));		
		shows.add(new Show("The Flash", 2000, eps1)); 
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Damaged", 44));
		eps2.add(new Episode("Legends of Yesterday", 45));
		eps2.add(new Episode("At Years End", 46));
		eps2.add(new Episode("Fallout", 47));
		shows.add(new Show("Arrow", 2100, eps2)); 
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Wormey", 9));
		eps3.add(new Episode("Frankendoodle", 10));
		eps3.add(new Episode("Band Geeks", 11));
		shows.add(new Show("Spongebob Squarepants", 1500, eps3)); 
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("Taylor Swift", 59));
		eps4.add(new Episode("Jennifer Lawrence", 57));
		eps4.add(new Episode("Ice T", 58));
		shows.add(new Show("The Tonight Show", 2300, eps4)); 

	    showResults.add(43.0);
	    showResults.add(32.83);
	    showResults.add(37.83);
	    showResults.add(58.0);
  }
  
  @Test
  public void testDS1() 
  {
	  LinkedList<Double> runtimes = D1.dataSmooth(shows);

	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(showResults.get(i), runtimes.get(i), .01);
	  }
  }
  
  @Test
  public void testDS2() 
  {
	  LinkedList<Double> runtimes = D2.dataSmooth(shows);

	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(showResults.get(i), runtimes.get(i), .01);
	  }
  }
  
}
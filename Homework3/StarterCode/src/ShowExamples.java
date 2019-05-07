import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Rogue Air", 42));
		eps1.add(new Episode("Legends of Today", 43));
		eps1.add(new Episode("Invasion", 44));			
		Show s1 = new Show("The Flash", 2000, eps1);
		shows.add(s1);
		report1.primetime.add(s1);
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Damaged", 44));
		eps2.add(new Episode("Legends of Yesterday", 45));
		eps2.add(new Episode("At Years End", 46));
		eps2.add(new Episode("Fallout", 47));
		Show s2 = new Show("Arrow", 2100, eps2);
		shows.add(s2);
		report1.primetime.add(s2);
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Wormey", 9));
		eps3.add(new Episode("Frankendoodle", 10));
		eps3.add(new Episode("Band Geeks", 11));
		Show s3 = new Show("Spongebob Squarepants", 1500, eps3);
		shows.add(s3);
		report1.daytime.add(s3);
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("Taylor Swift", 59));
		eps4.add(new Episode("Jennifer Lawrence", 57));
		eps4.add(new Episode("Ice T", 58));
		Show s4 = new Show("The Tonight Show", 2230, eps4);
		shows.add(s4);
		report1.primetime.add(s4);
	}
	
	
	
	@Test
	public void testOrganizeShows1() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	@Test
	public void testOrganizeShows2() 
	{
		ShowSummary report2 = sm2.organizeShows(shows);
		assertEquals(report1, report2);
	}
	

}

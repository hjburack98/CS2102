import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		ShowSummary organizedSummary = new ShowSummary();
	
		for(Show aShow: shows) {
			if(aShow.broadcastTime >= 0600 && aShow.broadcastTime < 1700) {
				organizedSummary.daytime.add(aShow);
			}
			
			else if(aShow.broadcastTime >= 1700 && aShow.broadcastTime < 2300) {
				organizedSummary.primetime.add(aShow);
			}
		}
		return organizedSummary;
	}
	
}

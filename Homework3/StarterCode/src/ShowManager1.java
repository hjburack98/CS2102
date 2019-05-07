import java.util.LinkedList;

class ShowManager1 {

	ShowManager1() {
	}

	public ShowSummary organizeShows(LinkedList<Show> shows) {

		ShowSummary organizedSummary = new ShowSummary();

		for (Show aShow : shows) {
			if (aShow.broadcastTime >= 0600 && aShow.broadcastTime < 1700) {
				organizedSummary.daytime.add(aShow);
				shows.remove(aShow);
			}
		}

		organizedSummary.primetime.addAll(shows);

		return organizedSummary;

	}

}

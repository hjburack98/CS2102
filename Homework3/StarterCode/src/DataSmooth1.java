import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  double totalRunTime = 0;
	  int numOfEpisodes = 0;
	  double averageTime = 0;
	  double smoothedData;
	  
	  LinkedList<Double> averageTimeShow = new LinkedList<Double>();
	  LinkedList<Double> smoothedTimeShow = new LinkedList<Double>();
	  
	  for(Show aShow : shows) {
		  for(Episode anEpisode: aShow.episodes) {
			  totalRunTime = totalRunTime + anEpisode.runTime;
			  numOfEpisodes = numOfEpisodes + 1;
		  }

		  averageTime = totalRunTime / numOfEpisodes;
		  averageTimeShow.add(averageTime);
		  totalRunTime = 0;
		  numOfEpisodes = 0;

		  
		  
	  }

	 
	  
	  for(int i = 1; i < averageTimeShow.size() - 1; i++) {
			   smoothedData = (averageTimeShow.get(i) + averageTimeShow.get(i-1) + averageTimeShow.get(i+1)) / 3;
			   smoothedTimeShow.add(smoothedData);

	   }
	 
	  smoothedTimeShow.addFirst(averageTimeShow.getFirst());
	  smoothedTimeShow.addLast(averageTimeShow.getLast());
	  
	  return smoothedTimeShow;
	  
  }
}
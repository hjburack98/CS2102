
public class DVD extends CirculatingItem {
	String location = "Circulation Desk";
	
	
	DVD (String title, String location, int timesOut, boolean isAvailable){
		super(title, location, timesOut, isAvailable);
	}

	
	public double lateFee(int daysOverdue) {
		double lateFeePrice;
		if(daysOverdue <= 3) {
			lateFeePrice = 5;
		}
		else {
			lateFeePrice = 20;
		}
		
		return lateFeePrice;
	}
	
}


public abstract class CirculatingItem extends LibItem implements IBorrowable{
	int timesOut;
	boolean isAvailable;
	
	CirculatingItem(String title, String location, int timesOut, boolean isAvailable){
		super(title, location);
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}
	
	CirculatingItem checkIn() {
		this.isAvailable = true;
		return this;
	}
	
	CirculatingItem checkOut() {
		this.isAvailable = false;
		this.timesOut = timesOut++;
		return this;
	}
	

}

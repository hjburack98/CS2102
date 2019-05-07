
public class Book extends LibItem {
	String title;
	String callNum;
	int timesOut = 0;
	boolean isAvailable = true;
	
	Book(String title, String callNum, int timesOut, boolean isAvailable){
		super(title, callNum);
		
	}
	
	Book (String title, String callNum){
		super(title, callNum);
	}
	
	
	
	//make a request for this boo by the patron with the given card number
	//give card number
	
	Request makeRequest(int byCardNum) {
		return new Request(this, byCardNum);
	}
	

	/*
	 * will only use if checkOut method is in the Book class
	//replace the book if it has been checked out more than 400 times
	void replaceBook() {
		if(this.checkOut().timesOut > 400) {
			this.checkOut().timesOut = 0;
			this.checkOut().isAvailable = true;
		}
	}
	*/
	
	public double lateFee(int daysOverdue) {
		return daysOverdue * 0.25;
	}

}


class Reading{
	private Time readingTime;
	private int temp;
	
	Reading(Time readingTime, int temp){
		this.readingTime = readingTime;
		this.temp = temp;
	}
	
	
	//getter functions for the variables
	
	Time getTime() {
		return this.readingTime;
	}
	
	int getTemp() {
		return this.temp;
	}
}

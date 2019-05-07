
abstract class AbsSkiing implements IEvent{
	double time; //in seconds
	int position; 
	
	AbsSkiing(double time, int position){
		this.time = time;
		this.position = position;
	}
}

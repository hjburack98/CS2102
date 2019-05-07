
public class SkiingResult implements IEvent{
	double time; //in seconds
	int position; //final place in the race
	ShootingResult shooting; //shooting score of the athlete
	
	SkiingResult(double time, int position, ShootingResult shooting){
		this.time = time; 
		this.position = position;
		this.shooting = shooting;
	}
	
	//Takes no parameters and produces the total skiing points earned for an athlete that came in:
	//first place
	//second place
	//third place
	//all other positions
	//Adds the athlete's time and the shooting penalty, and subtracts a bonus if applicable
	public double pointsEarned() {
		if(this.position == 1) {
			return ((this.time + this.addShootingPenalties(this.shooting)) - 10); //10 second bonus for first place
		}
		
		else if(this.position == 2) {
			return ((this.time + this.addShootingPenalties(this.shooting)) - 7); //7 second bonus for second place
		}
		
		else if(this.position == 3) {
			return ((this.time + this.addShootingPenalties(this.shooting)) - 3); //3 second bonus for third place
		}
		
		else {
			return (this.time + this.addShootingPenalties(this.shooting));
		}
	}
	
	//Takes a shooting result, and produces the penalty of missing a target by:
	//calculates the number of targets missed
	//multiplies the total number of targets missed by 20, signifying a 20 second penalty for each target missed
	public double addShootingPenalties(ShootingResult shooting) {
		return (20 *((5-this.shooting.round1.targetsHit)+(5-this.shooting.round2.targetsHit)+(5-this.shooting.round3.targetsHit)+(5-this.shooting.round4.targetsHit)));
	}
	
	
}

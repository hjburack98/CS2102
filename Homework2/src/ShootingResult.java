import java.util.LinkedList;

public class ShootingResult implements IEvent{
	 //4 shooting rounds
	 LinkedList<ShootingRound> shootingRounds;

	 
	 ShootingResult(LinkedList<ShootingRound> shootingRounds){
		 this.shootingRounds = shootingRounds;

	 }
	 //Takes no parameters, and produces the total number of targets hit by the athlete
	 public double pointsEarned() {
		 double targetSum = 0;
		 
		 for(ShootingRound aRound : this.shootingRounds) {
			 targetSum = targetSum + aRound.targetsHit;
		 }

		 return targetSum;
	 }
	 
	 //takes no parameters, and produces the best shooting round
	 public ShootingRound bestRound() {
		 ShootingRound bestShooting = new ShootingRound(0);
		 
		 for(ShootingRound aRound : this.shootingRounds) {
			 if(aRound.targetsHit >= bestShooting.targetsHit) {
				 bestShooting = aRound;
			 }			 
		 }
		 return bestShooting;
	 }
}

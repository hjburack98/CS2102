
 public class ShootingResult implements IEvent{
	 //4 shooting rounds
	 ShootingRound round1; 
	 ShootingRound round2;
	 ShootingRound round3;
	 ShootingRound round4;

	 
	 ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4){
		 this.round1 = round1;
		 this.round2 = round2;
		 this.round3 = round3;
		 this.round4 = round4;

	 }
	 //Takes no parameters, and produces the total number of targets hit by the athlete
	 public double pointsEarned() {
		 return (this.round1.targetsHit + this.round2.targetsHit + this.round3.targetsHit + this.round4.targetsHit);
	 }
}

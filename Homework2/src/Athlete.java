
 class Athlete {
	 ShootingResult shooting;
	 SkiingResult skiing;
	 String name;
	 
	 Athlete(ShootingResult shooting, SkiingResult skiing, String name){
		 this.shooting = shooting;
		 this.skiing = skiing;
		 this.name = name;
	 }
	 
	 //Takes another athlete and produces the athlete that has earned more skiing points
	 public Athlete betterSkiier(Athlete otherAthlete) {
		 if(this.skiing.pointsEarned() > otherAthlete.skiing.pointsEarned()) {
			 return otherAthlete;
		 }
		 
		 else {
			 return this;
		 }
		 
	 }
	 //Takes another athlete and produces true if:
	 //this athlete has a higher shooting score than the given athlete
	 //OR
	 //this athlete has a lower skiing score than the given athlete
	 public boolean hasBeaten(Athlete otherAthlete) {
		return ((this.shooting.pointsEarned() > otherAthlete.shooting.pointsEarned()) || (this.skiing.pointsEarned() < otherAthlete.skiing.pointsEarned()));
	 }
}

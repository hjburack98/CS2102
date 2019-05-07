import java.util.LinkedList;

public class Competition {
	LinkedList<Athlete> athletes;
	int numOfShootingRounds;
	
	Competition(int numOfShootingRounds, LinkedList<Athlete> athletes){
		this.numOfShootingRounds = numOfShootingRounds;
		this.athletes = athletes;
	}
	
	//takes no parameters, and returns a LinkedList of all athletes that do not have the proper number of shooting rounds required for the competition
	public LinkedList<String> shootingDNF(){
		LinkedList<String> dnf = new LinkedList<String>();
		
		for(Athlete anAthlete : athletes) {
			
			if(anAthlete.shooting.shootingRounds.size() != numOfShootingRounds) {
				dnf.add(anAthlete.name);
			}
		}
		return dnf;
	}
	
	//takes the name of an athlete, and returns the score the athlete earned in the skiing competition
	public double skiingScoreForAthlete(String athleteName) {
		double skiingScore = 0;

		for(Athlete anAthlete : this.athletes) {
			if(anAthlete.name.equals(athleteName)) {
				
				skiingScore = anAthlete.skiing.pointsEarned();
			}
		}
		return skiingScore;
	}
	
	//takes another competition, and returns true if any of the athletes did better in the other competition than this competition
	public boolean anySkiingImprovement(Competition aCompetition) {
		boolean improvement = false;
		
		for(Athlete anAthlete : this.athletes) {
			for(Athlete otherAthlete : aCompetition.athletes) {
				
				if(anAthlete.name.equals(otherAthlete.name)){
					
					if (this.skiingScoreForAthlete(anAthlete.name) > aCompetition.skiingScoreForAthlete(otherAthlete.name)) {
						improvement = true;
					}
				}
			}
		}
		return improvement;
	}
	
	//I believe that I could have used a helper function in the anySkiingImprovements method. 
	//This helper function could have been used to find the same athlete in the second competition.
	//This helper function could be modified to match the name of an athlete to a string in order to be applicable to the skiingScoreForAthlete method
	//Both my partner and I are satisfied with how both these methods turned out, however these helper functions could make the methods more efficient
	
	
}

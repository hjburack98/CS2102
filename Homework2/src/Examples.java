//Harrison Burack
//Amanda Goss

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class Examples {
	//making the ShootinRound lists
	LinkedList<ShootingRound> evanShootingRound = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> jonShootingRound = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> mattShootingRound = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> kyleShootingRound = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> mandyShootingRound = new LinkedList<ShootingRound>();
	
	//making the ShootingRounds to go in the list
	ShootingRound evanRound1 = new ShootingRound(5);
    ShootingRound evanRound2 = new ShootingRound(5);
    ShootingRound evanRound3 = new ShootingRound(5);
    ShootingRound evanRound4 = new ShootingRound(5);
    
    ShootingRound jonRound1 = new ShootingRound(4);
    ShootingRound jonRound2 = new ShootingRound(5);
    ShootingRound jonRound3 = new ShootingRound(4);
    ShootingRound jonRound4 = new ShootingRound(4);
    
    ShootingRound mattRound1 = new ShootingRound(2);
    ShootingRound mattRound2 = new ShootingRound(3);
    ShootingRound mattRound3 = new ShootingRound(5);
    ShootingRound mattRound4 = new ShootingRound(4);
    
    ShootingRound kyleRound1 = new ShootingRound(1);
    ShootingRound kyleRound2 = new ShootingRound(0);
    ShootingRound kyleRound3 = new ShootingRound(0);
    ShootingRound kyleRound4 = new ShootingRound(0);
    
    ShootingRound mandyRound1 = new ShootingRound(3);
    ShootingRound mandyRound2 = new ShootingRound(3);
    ShootingRound mandyRound3 = new ShootingRound(4);
    
    LinkedList<Athlete> athletesInBiathlon = new LinkedList<Athlete>(); //list of athletes in the Biathlon event
    
    Competition biathlon = new Competition(4, athletesInBiathlon);
    

    //adding shooting rounds to the constructor
    public Examples(){
    		evanShootingRound.add(evanRound1);
    		evanShootingRound.add(evanRound2);
    		evanShootingRound.add(evanRound3);
    		evanShootingRound.add(evanRound4);
    		
    		jonShootingRound.add(jonRound1);
    		jonShootingRound.add(jonRound2);
    		jonShootingRound.add(jonRound3);
    		jonShootingRound.add(jonRound4);
    		
    		mattShootingRound.add(mattRound1);
    		mattShootingRound.add(mattRound2);
    		mattShootingRound.add(mattRound3);
    		mattShootingRound.add(mattRound4);
    		
    		kyleShootingRound.add(kyleRound1);
    		kyleShootingRound.add(kyleRound2);
    		kyleShootingRound.add(kyleRound3);
    		kyleShootingRound.add(kyleRound4);
    		
    		mandyShootingRound.add(mandyRound1);
    		mandyShootingRound.add(mandyRound2);
    		mandyShootingRound.add(mandyRound3);
    		
    		athletesInBiathlon.add(evan);
    		athletesInBiathlon.add(jon);
    		athletesInBiathlon.add(matt);
    		athletesInBiathlon.add(kyle);
    		athletesInBiathlon.add(mandy);
    		
    }
    
    
     
    
    //making the shootingResult for each athlete
    ShootingResult evanShooting = new ShootingResult(evanShootingRound);
    ShootingResult jonShooting = new ShootingResult(jonShootingRound);
    ShootingResult mattShooting = new ShootingResult(mattShootingRound);
    ShootingResult kyleShooting = new ShootingResult(kyleShootingRound);
    ShootingResult mandyShooting = new ShootingResult(mandyShootingRound);
    
    //making the skiingResult for each athlete
    SkiingResult evanSkiing = new SkiingResult(2970, 1, evanShooting);
    SkiingResult jonSkiing = new SkiingResult(4000, 5, jonShooting);
    SkiingResult mattSkiing = new SkiingResult(3120, 2, mattShooting);
    SkiingResult kyleSkiing = new SkiingResult(3600, 3, kyleShooting);
    SkiingResult mandySkiing = new SkiingResult(3750, 4, mandyShooting);
    
    //making athletes that will compete against each other
    Athlete evan = new Athlete(evanShooting, evanSkiing, "Evan");
    Athlete jon = new Athlete(jonShooting, jonSkiing, "Jon");
    Athlete matt = new Athlete(mattShooting, mattSkiing, "Matt");
    Athlete kyle = new Athlete(kyleShooting, kyleSkiing, "Kyle");
    Athlete mandy = new Athlete(mandyShooting, mandySkiing, "Mandy");
    
    //making the massStart results of an athlete
    MassStartResult jordanMassStart = new MassStartResult(3120.05, 1);
    
    //test to show the results of a massStart event
    @Test
    public void mattMassStartResult() {
    		assertEquals(3120.05, jordanMassStart.pointsEarned(), 0.01);
    }
    
    //test to show the shooting points earned by an athlete
    @Test
    public void showEvanShootingPointsEarned() {
    		assertEquals(20, evan.shooting.pointsEarned(),0.1);
    }
    
    @Test
    public void showJonShootingPointsEarned() {
    		assertEquals(17, jon.shooting.pointsEarned(), 0.1);		
    }
    
    @Test
    public void showMattShootingPointsEarned() {
    		assertEquals(14, matt.shooting.pointsEarned(), 0.1);
    }
    
    @Test 
    public void showKyleShootingPointsEarned() {
    		assertEquals(1, kyle.shooting.pointsEarned(), 0.1);
    }
    
    @Test
    public void showMandyShootingPointsEarned() {
    		assertEquals(10, mandy.shooting.pointsEarned(), 0.1);
    }
    
    //test to show the best round of a shooter
    @Test
    public void mattBestRound() {
    		assertEquals(mattRound3, matt.shooting.bestRound());
    }
    
    @Test
    public void evanBestScore() {
    		assertEquals(evanRound4, evan.shooting.bestRound());
    }
    
    @Test
    public void kyleBestScore() {
    		assertEquals(kyleRound1, kyle.shooting.bestRound());
    }
    
    @Test
    public void jonBestScore() {
    		assertEquals(jonRound2, jon.shooting.bestRound());
    }
    
    //adds the athletes who have not completed 
	LinkedList<String> athletesDNF = new LinkedList<String>(); //This list will be a list of athletes who have not completed the competition
   
	@Before
    public void setUp() {
    		athletesDNF.add("Mandy");
    }
	
    @Test
    public void athletesHaveNotCompleted() {

    		assertEquals(athletesDNF, biathlon.shootingDNF());
    }
    
    //tests that the skiing score for an athlete will be produced
    @Test
	public void evanSkiingScore() {
		assertEquals(2960, biathlon.skiingScoreForAthlete("Evan"), 0.1);
	}
    

    //PREPARATION FOR anySkiingImprovement TESTING
    
    //making an improved skiing score for one of the athletes, and worse score for all athletes
    SkiingResult improvedEvanSkiing = new SkiingResult(2860, 1, evanShooting);
    SkiingResult worseEvanSkiing = new SkiingResult(3000, 1, evanShooting);
    SkiingResult worseJonSkiing = new SkiingResult(4100, 5, jonShooting);
    SkiingResult worseMattSkiing = new SkiingResult(3220, 2, mattShooting);
    SkiingResult worseKyleSkiing = new SkiingResult(3700, 3, kyleShooting);
    SkiingResult worseMandySkiing = new SkiingResult(3850, 4, mandyShooting);
    
    //make worse/improved athletes
    Athlete improvedEvan = new Athlete(evanShooting, improvedEvanSkiing, "Evan");
    Athlete worseEvan = new Athlete(evanShooting, worseEvanSkiing, "Evan");
    Athlete worseJon = new Athlete(jonShooting, worseJonSkiing, "Jon");
    Athlete worseMatt = new Athlete(mattShooting, worseMattSkiing, "Matt");
    Athlete worseKyle = new Athlete(kyleShooting, worseKyleSkiing, "Kyle");
    Athlete worseMandy = new Athlete(mandyShooting, worseMandySkiing, "Mandy");
    
    
    //creating a competition where Evan scored better
    LinkedList<Athlete> betterEvanAthletes = new LinkedList<Athlete>();
    Competition betterEvanBiathlon = new Competition(4, betterEvanAthletes);
    
    //creating a worse competition for the athletes
    LinkedList<Athlete> worseAthletes = new LinkedList<Athlete>();
    Competition worseBiathlon = new Competition(4, worseAthletes);
    
    //Add the athletes to betterEvanBiathlon
    @Before
    public void setUpImprovement(){
    		betterEvanAthletes.add(worseJon);
    		betterEvanAthletes.add(worseMandy);
    		betterEvanAthletes.add(worseKyle);
    		betterEvanAthletes.add(improvedEvan);
    		betterEvanAthletes.add(worseMatt);
    		
    }
    
    //Test to show that an athlete showed improvement
    @Test
    public void athleteShowsImprovement() {
    		assertTrue(biathlon.anySkiingImprovement(betterEvanBiathlon));
    }
    
    //Add the athletes to worseBiathlon
    @Before
    public void setUpWorse() {
    		worseAthletes.add(worseKyle);
    		worseAthletes.add(worseMatt);
    		worseAthletes.add(worseEvan);
    		worseAthletes.add(worseMandy);
    		worseAthletes.add(worseJon);
    }
    
    //test to show that no athletes showed improvement
    @Test
    public void noImprovement() {
    		assertFalse(biathlon.anySkiingImprovement(worseBiathlon));
    }
    

    
 
    
  
   
   

  
}

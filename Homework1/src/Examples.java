//Harrison Burack
//Amanda Goss

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}
    
    //making the shootingRound for each athlete
    ShootingRound evanRound1 = new ShootingRound(5);
    ShootingRound evanRound2 = new ShootingRound(5);
    ShootingRound evanRound3 = new ShootingRound(5);
    ShootingRound evanRound4 = new ShootingRound(5);
    
    ShootingRound jonRound1 = new ShootingRound(4);
    ShootingRound jonRound2 = new ShootingRound(4);
    ShootingRound jonRound3 = new ShootingRound(4);
    ShootingRound jonRound4 = new ShootingRound(4);
    
    ShootingRound mattRound1 = new ShootingRound(2);
    ShootingRound mattRound2 = new ShootingRound(3);
    ShootingRound mattRound3 = new ShootingRound(4);
    ShootingRound mattRound4 = new ShootingRound(5);
    
    ShootingRound kyleRound1 = new ShootingRound(0);
    ShootingRound kyleRound2 = new ShootingRound(0);
    ShootingRound kyleRound3 = new ShootingRound(0);
    ShootingRound kyleRound4 = new ShootingRound(0);
     
    
    //making the shootingResult for each athlete
    ShootingResult evanShooting = new ShootingResult(evanRound1, evanRound2, evanRound3, evanRound4);
    ShootingResult jonShooting = new ShootingResult(jonRound1, jonRound2, jonRound3, jonRound4);
    ShootingResult mattShooting = new ShootingResult(mattRound1, mattRound2, mattRound3, mattRound4);
    ShootingResult kyleShooting = new ShootingResult(kyleRound1, kyleRound2, kyleRound3, kyleRound4);
    
    //making the skiingResult for each athlete
    SkiingResult evanSkiing = new SkiingResult(2970, 1, evanShooting);
    SkiingResult jonSkiing = new SkiingResult(4000, 4, jonShooting);
    SkiingResult mattSkiing = new SkiingResult(3120, 2, mattShooting);
    SkiingResult kyleSkiing = new SkiingResult(3600, 3, kyleShooting);
    
    //making two athletes that will compete against each other
    Athlete evan = new Athlete(evanShooting, evanSkiing);
    Athlete jon = new Athlete(jonShooting, jonSkiing);
    Athlete matt = new Athlete(mattShooting, mattSkiing);
    Athlete kyle = new Athlete(kyleShooting, kyleSkiing);
    
    //test to show the shooting points earned by an athlete
    @Test
    public void showEvanShootingPointsEarned() {
    		assertEquals(20, evan.shooting.pointsEarned(),0.1);
    }
    
    @Test
    public void showJonShootingPointsEarned() {
    		assertEquals(16, jon.shooting.pointsEarned(), 0.1);		
    }
    
    @Test
    public void showMattShootingPointsEarned() {
    		assertEquals(14, matt.shooting.pointsEarned(), 0.1);
    }
    
    @Test 
    public void showKyleShootingPointsEarned() {
    		assertEquals(0, kyle.shooting.pointsEarned(), 0.1);
    }
    
    // WITH ALL TESTS OF pointsEarned BEING CORRECT, THAT MEANS addShootingPenalties RUNS CORRECTLY AS WELL
    //test to show the skiing points by a first place athlete
    @Test
    public void showFirstSkiingPointsEarned() {
    		assertEquals(2960, evan.skiing.pointsEarned(), 0.1);
    }
    
    //test to show the skiing points by a second place athlete
    @Test
    public void showSecondSkiingPointsEarned() {
    		assertEquals(3233, matt.skiing.pointsEarned(), 0.1);
    }
    
    //test to show the skiing points by a third place athlete
    @Test
    public void showOtherSkiingPointsEarned() {
    		assertEquals(4080, jon.skiing.pointsEarned(), 0.1);
    }
    
    //test to show the skiing position of a non-medaling athlete
    @Test
    public void showThirdSkiingPointsEarned() {
    		assertEquals(3997, kyle.skiing.pointsEarned(), 0.1);
    }
    
    //test to show that evan is a better skiier than jon
    @Test
    public void evanBetterSkiier() {
    		assertEquals(evan, evan.betterSkiier(jon));
    }
    
    //test showing that matt is a better skiier than kyle
    @Test
    public void mattBetterSkiier() {
    		assertEquals(matt, matt.betterSkiier(kyle));
    }
    
    //test showing that jon is not a better skiier than kyle
    @Test
    public void kyleNotBetterSkiier() {
    		assertEquals(kyle, jon.betterSkiier(kyle));
    }
    
    //test to show that evan has beaten kyle
    @Test
    public void  evanHasBeatenKyle() {
    		assertTrue(evan.hasBeaten(kyle));
    }
    
    //test showing that jon has beaten matt
    @Test
    public void jonHasBeatenMatt() {
    		assertTrue(jon.hasBeaten(matt));
    }
    
    //test showing that kyle has not beaten matt
    	@Test
    	public void kyleHasNotBeatenMatt() {
    		assertFalse(kyle.hasBeaten(matt));
    	}
    	
    	//test showing that matt has not beaten evan
    	@Test 
    	public void mattHasNotBeatenEvan() {
    		assertFalse(matt.hasBeaten(evan));
    	}
  
}

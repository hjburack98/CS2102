import java.util.Scanner;

class VotingMachine {
	private ElectionData data;
	Scanner keyboard = new Scanner(System.in);
	
	VotingMachine(ElectionData data){
		this.data = data;
	}
	
	public void display() throws DuplicateVotesException, UnknownCandidateException{
		data.printBallot();
	    System.out.println("Who is your first choice?");
	    String candidate1 = keyboard.next();
	    System.out.println("Who is your second choice?");
	    String candidate2 = keyboard.next();
	    System.out.println("Who is your third choice?");
	    String candidate3 = keyboard.next();
	    
	    try {
	    data.processVote(candidate1, candidate2, candidate3);
	    

	    }
	    catch (DuplicateVotesException e) {
	    		System.out.println("You have the same candidate for two different choices.");
	    		display();
	    }
	    catch (UnknownCandidateException e) {
	    		System.out.println("One of your candidates is not on the ballot");
	    		display();
	    }
	    
	    System.out.println("You voted for " + candidate1 + ", " + candidate2 + ", " + candidate3);
	    System.out.println("Thank you for voting");
	    
	}

}

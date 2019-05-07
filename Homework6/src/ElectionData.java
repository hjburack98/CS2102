import java.util.HashMap;
import java.util.Scanner;

class ElectionData {
  private HashMap<String, CandidateChoice> ballot = new HashMap<>();
  
  Scanner keyboard = new Scanner(System.in);
  
  ElectionData() {}
  
  public void printBallot() {
    System.out.println("The candidates are ");
    for (String s : ballot.keySet()) {
      System.out.println(s);
    }
  }
  
  public void processVote(String first, String second, String third) throws DuplicateVotesException, UnknownCandidateException{
	  if(!ballot.containsKey(first)) {
		  throw new UnknownCandidateException(first);
	  }
	  else if(!ballot.containsKey(second)) {
		  throw new UnknownCandidateException(second);
	  }
	  else if(!ballot.containsKey(third)) {
		  throw new UnknownCandidateException(third);
	  }
	  else if(first == second || first == third) {
		  throw new DuplicateVotesException(first);
	  }
	  else if(second == third) {
		  throw new DuplicateVotesException(second);
	  }
	  else {
		  ballot.get(first).incrementFirst();
		  ballot.get(second).incrementSecond();
		  ballot.get(third).incrementThird();;
	  }
  }
		  
  
  public void addCandidate(String candidate) throws CandidateExistsException {
	  if(ballot.containsKey(candidate)) {
		  throw new CandidateExistsException(candidate);
	  }
	  else {
		  ballot.put(candidate, new CandidateChoice());
	  }
  }
  
  public String findWinnerMostFirstVotes() {
	  String winner = null;
	  int mostFirstVotes = 0;
	  for(String key : ballot.keySet()) {
		  if(ballot.get(key).getFirstChoice() >= mostFirstVotes) {
			  winner = key;
			  mostFirstVotes = ballot.get(key).getFirstChoice();
		  }
	  }
	  
	  return winner;
  }
  
  public String findWinnerMostPoints() {
	  String winner = null;
	  int mostPoints = 0;
	  for(String key : ballot.keySet()) {
		  if(ballot.get(key).addAllVotes() > mostPoints) {
			  winner = key;
			  mostPoints = ballot.get(key).addAllVotes();
		  }
	  }
	  
	  return winner;
  }
  
  
 
  }

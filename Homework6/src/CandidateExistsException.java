
class CandidateExistsException extends Exception{
	private String existingCandidate;
	
	CandidateExistsException(String candidate){
		this.existingCandidate = candidate;
	}
}

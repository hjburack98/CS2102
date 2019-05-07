import java.util.LinkedList;

class AcctSet implements IAccountSet{
	 private LinkedList<Account> accounts = new LinkedList<Account>();
	
	// returns Account with given number, or throws exception if no such account
	  public Account findByNum(int num) {
	    for (Account acct:accounts) {                
	      if (acct.numMatches(num))
	        return acct;
	    }
	    return null;  // this should not be here -- replace with exception
	  }

}

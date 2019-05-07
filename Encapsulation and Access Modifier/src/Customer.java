import java.util.LinkedList;

class Customer {
	  private String name;   
	  private int password;  
	  private LinkedList<Account> accounts; 
	  
	  Customer(String name, int password) {
	    this.name = name;
	    this.password = password;
	    this.accounts = new LinkedList<Account>();
	  }
	  
	  // check whether customer has given name
	  public boolean nameMatches(String aname) {
	      return (this.name.equals(aname));
	  }
	   
	  // check whether the given password matches the one for this user
	  // in a real system, this method would return some object with
	  // info about the customer, not just a string
	  public void tryLogin(int withPwd) throws LoginFailedException {
	    if (this.password != withPwd)
	      throw new LoginFailedException();
	  }
	}


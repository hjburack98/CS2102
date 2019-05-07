import java.util.LinkedList;
import java.util.Scanner;

class BankingService {
	  private IAccountSet accounts;   
	  private ICustSet customers; 
	  private Scanner keyboard = new Scanner(System.in);
	  
	  BankingService(IAccountSet accounts, ICustSet customers) {
	    this.accounts = accounts;
	    this.customers = customers;
	  }
	  
	  // this method should be allowed to assume that the acct num is valid
	  // some other method has task of handling that problem
	  public double getBalance(int forAcctNum) {  
	    Account acct = accounts.findByNum(forAcctNum) ;
	    return acct.getBalance();
	  }
	  
	  // this method should be allowed to assume that the acct num is valid
	  // some other method has task of handling that problem
	  public double withdraw(int forAcctNum, double amt) {  
	    Account acct = accounts.findByNum(forAcctNum) ;
	    return acct.withdraw(amt);
	  }
	  
	  // note this doesn't catch the LoginFailedException
	  // from tryLogin -- it just lets that one pass back
	  // to the method that called this one.
	  public void login(String custname, int withPwd) throws LoginFailedException {
	    try {
	      Customer cust = customers.findByName(custname);
	      cust.tryLogin(withPwd); 
	    } catch (CustNotFoundException e) {
	      throw new LoginFailedException();
	    }
	  }
	    // displays the login screen for the banking software,
	  //   reads login data, and attempts to log user in.
	  public void loginScreen() {
	    // prompt for user to enter name and password
	    System.out.println("Welcome to the Bank.  Please log in.");
	    System.out.print("Enter your username: ");
	    String username = keyboard.next();
	    System.out.print("Enter your password: ");
	    int password = keyboard.nextInt();
	    try {
	      this.login(username,password);
	    } catch (LoginFailedException e) {
	      System.out.println("Login Failed. Try Again");
	      this.loginScreen();
	    }
	  }

	}


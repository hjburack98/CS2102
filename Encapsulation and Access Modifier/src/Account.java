
class Account {
  private int number;      
  private Customer owner;  
  private double balance;  
  
  // check whether account has given num
  public boolean numMatches(int anum) {
      return (this.number == anum);
  }
  
  // returns the balance in this account
  public double getBalance() {
    return this.balance;
  }
  
  // method to withdraw given amount
  public double withdraw(double amt) {
    this.balance = this.balance - amt;
    return amt;
  }
}


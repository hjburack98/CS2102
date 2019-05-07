import java.util.LinkedList;

class CustSet implements ICustSet {
	  private LinkedList<Customer> customers = new LinkedList<Customer>();
	  
	  // adds customer to the list of customers
	  public void addCust(Customer newC) {
	    this.customers.add(newC);
	  }
	  
	  // returns Customer with given name, or throws exception if no such customer
	  public Customer findByName(String name) throws CustNotFoundException {
	    for (Customer cust:customers) {    
	      if (cust.nameMatches(name))
	        return cust;
	    }
	    throw new CustNotFoundException(name);
	  }
	}

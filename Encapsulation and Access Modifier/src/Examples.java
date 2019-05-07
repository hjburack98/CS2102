
class Examples {
  Customer gompeiCust = new Customer("gompei", 1865);
 
 // method to initialize a banking service with Gompei as the customer
  BankingService setUpGompei() {
    CustSet allCusts = new CustSet();
    allCusts.addCust(gompeiCust);
    return new BankingService(new AcctSet(), allCusts);
  } 
}

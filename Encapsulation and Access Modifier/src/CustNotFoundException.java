
class CustNotFoundException extends Exception {
  private String unfoundName;
  
  CustNotFoundException(String name) {
    this.unfoundName = name;
  }
  
  public String getUnfoundName() {
    return this.unfoundName;
  }
}

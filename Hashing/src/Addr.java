
public class Addr {
	int num;
	String street;
	
	public Addr(int num, String street) {
		this.num = num;
		this.street = street;
	}
	
	//a simple hashCode function multiplies the hashCode of each 
	//field that matters to equals by a unique prime, 
	//and sums the results
	public int hashCode() {
		return (this.num * 3) + (this.street.hashCode() * 11);
	}
}


public interface ICustSet {
	Customer findByName(String name) throws CustNotFoundException;
}

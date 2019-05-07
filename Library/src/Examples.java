import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class Examples {

	WordList fruitBasket = new WordList();
	

	// fruitBasket.addWord("pears"); // needs to be inside a method // aka moved to
	// Examples

	public Examples() {

		fruitBasket.addWord("pears");
		fruitBasket.addWord("apples");

	}
	
	
	Book deal = new Book("Art of the Deal", "QA 2345", 0, true);
	Book alice = new Book("Alice in Wonderland", "PR 222", 0, true);
	Book hamlet = new Book("Hamlet", "QA 6789");
	Request reqHamlet = hamlet.makeRequest(1234);
	Library gordonLib = new Library();
	
	@Before
	public void setUp() {
		gordonLib.addBook(deal).addBook(alice).addBook(hamlet);
	}
	
	@Test
	public void testCheckedOut() {
		LinkedList<Book> result = new LinkedList<Book>();
		deal.isAvailable = false;
		hamlet.isAvailable = false;
		result.add(deal);
		result.add(hamlet);
		assertEquals(result, gordonLib.checkedOut());
	}

}


import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Examples {
	public Examples() {}
	
	HeapTester h1 = new HeapTester();
	IHeap emptyHeap = new MtHeap();
	IHeap filledHeap = new DataHeap(6);
	IHeap bigHeap = new DataHeap(4, new DataHeap(16), new DataHeap(6));
	
	@Test
	public void addEmptyElt() {
		assertTrue(h1.addEltTester(emptyHeap, 2, new DataBT(2)));
	}
	
	@Test
	public void addToFilled() {
		assertTrue(h1.addEltTester(filledHeap, 2, filledHeap.addElt(2)));
	}
	
	@Test
	public void addToBigList() {
		assertTrue(h1.addEltTester(bigHeap, 5, bigHeap.addElt(5)));
	}
	
	@Test
	public void removeBecomesEmpty(){
		assertTrue(h1.remMinEltTester(filledHeap, filledHeap.remMinElt()));
	}
	
	@Test
	public void removingWithEmpty() {
		assertTrue(h1.remMinEltTester(emptyHeap, emptyHeap.remMinElt()));
	}
	
	@Test
	public void removeBigHeap() {
		assertTrue(h1.remMinEltTester(bigHeap, bigHeap.remMinElt()));
	}

}

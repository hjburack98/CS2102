import static org.junit.Assert.*;
import org.junit.Test;	

public class Examples {
	
	//create a node hart	"Hartford"
		 //						empty list
		 
		 //create a node prov	"Providence"
		 //						list that contains hart
		 
		 //create a node bost	"Boston"
		 //						must use mutators to fix edges of list

	Node bost, prov, hart, manc, worc;
	Graph g = new Graph();
	
	
	 public Examples() {
		 //call initGraph to set the graph up for test cases
		 initGraph();
	 }
	 
	 public void initGraph() {
		 bost = g.newNode("Boston");
		 prov = g.newNode("Providence");
		 worc = g.newNode("Worcester");
		 hart = g.newNode("Hardford");
		 manc = g.newNode("Manchester");
		 
		 g.addDirectedEdge(manc, bost);
		 g.addDirectedEdge(bost, worc);
		 g.addDirectedEdge(bost, prov);
		 g.addDirectedEdge(worc, bost);
		 g.addDirectedEdge(prov, hart);
		 
	 }
	 
	 //is there a route from Boston to Worcester? T
	 @Test
	 public void bostToWorc() {
		 assertTrue(g.hasRoute(bost, worc));
	 }
	 
	 //is there a route from Providence to Boston? F
	 @Test
	 public void provToBost() {
		 assertFalse(g.hasRoute(prov, bost));
	 }
	 
	 //is there a route from Boston to Hartford? T
	 @Test
	 public void bostToHart() {
		 assertTrue(g.hasRoute(bost, hart));
	 }
	 
	 //is there a route from Boston to Boston? T
	 @Test
	 public void bostToBost() {
		 assertTrue(g.hasRoute(bost, bost));
	 }
	 
	 
	 
	 
}

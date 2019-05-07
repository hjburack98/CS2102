
interface IGraph {
	
	
	Node newNode(String cityName);
	
	void addDirectedEdge(Node from, Node to);
	
	boolean hasRoute(Node from, Node too);
}

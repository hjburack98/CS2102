import java.util.LinkedList;

class Graph implements IGraph{
	private LinkedList<Node> nodes;
	
	public Graph() {
		this.nodes = new LinkedList<Node>();
	}
	
	//how to create nodes for the graph
	public Node newNode(String cityName) {
		Node newN = new Node(cityName);
		this.nodes.add(newN);
		return newN;
	}
	
	//how to create edge between nodes in graph
	//add edge from the "from" node to the "to" node
	public void addDirectedEdge(Node from, Node to) {
		from.addEdge(to);
	}
	
	public boolean hasRoute(Node from, Node to) {
		return from.hasRoute(to, nodes);
	}
}

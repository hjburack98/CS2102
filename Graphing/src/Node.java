import java.util.LinkedList;

class Node {
	private String cityName;
	private LinkedList<Node> getsTo;
	
	public Node(String nameOfCity) {
		this.cityName = nameOfCity;
		this.getsTo = new LinkedList<Node>();
	}
	
	//must have a mutator function
	public void addEdge(Node toNode) {
		this.getsTo.add(toNode);
	}
	
	public boolean hasRoute(Node toNode, LinkedList<Node> visited) {
		if(this.equals(toNode)) {
			return true;
		}
		else if(visited.contains(this)) {
			return false;
		}
		else {
			visited.add(this);
			//go throught this node's adjacency list
			for(Node n : this.getsTo) {
				if(n.hasRoute(toNode, visited)) {
					return true;
				}
			}

		return false;
		}
	}
	
	public LinkedList<Node> findRoute(Node toNode, LinkedList<Node> visited){
		if(this.equals(toNode)) {
			LinkedList<Node> result = new LinkedList<Node>();
			result.add(this);
			return result;
		}
		
		else if(visited.contains(this)) {
			return new LinkedList<Node>();
		}
		
		else {
			visited.add(this);
			
			//go through Node's adjacency list
			for(Node n : this.getsTo) {
				LinkedList<Node> nRoute = n.findRoute(toNode, visited);
				if(nRoute.size() > 0) {
					nRoute.addFirst(this);
					return nRoute;
				}
			}
			
			return new LinkedList<Node>();
		}
	}
}

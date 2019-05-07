import java.lang.Math;
import java.util.LinkedList;

interface IBinTree {
 // determines whether element is in the tree
 boolean hasElt(int e);
 // returns number of nodes in the tree; counts duplicate elements as separate items
 int size();
 // returns depth of longest branch in the tree
 int height();
 
 boolean correctHeap(int previousRoot);
 
 LinkedList<Integer> toList();
}

class MtBT implements IBinTree {
 MtBT(){}

 // returns false since empty tree has no elements
 public boolean hasElt(int e) {
  return false;
 }

 // returns 0 since empty tree has no elements
 public int size() {
  return 0;
 }

 // returns 0 since empty tree has no branches
 public int height() {
  return 0;
 }
 
 public boolean correctHeap(int previousRoot) {
	 return true;
 }

@Override
public LinkedList<Integer> toList() {
	LinkedList<Integer> binTreeList = new LinkedList<Integer>();
	return binTreeList;
}
}

class DataBT implements IBinTree {
 int data;
 IBinTree left;
 IBinTree right;

 DataBT(int data, IBinTree left, IBinTree right) {
  this.data = data;
  this.left = left;
  this.right = right;
 }
 
 // an alternate constructor for when both subtrees are empty
 DataBT(int data) {
   this.data = data;
   this.left = new MtBT();
   this.right = new MtBT();
 }

 // determines whether this node or node in subtree has given element
 public boolean hasElt(int e) {
  return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
 }

 // adds 1 to the number of nodes in the left and right subtrees
 public int size() {
  return 1 + this.left.size() + this.right.size();
 }

 // adds 1 to the height of the taller subtree
 public int height() {
  return 1 + Math.max(this.left.height(), this.right.height());
 }
 
 //puts all numbers in the binary tree in a list
 public LinkedList<Integer> toList(){
		LinkedList<Integer> binTreeList = new LinkedList<Integer>();
		
		binTreeList.add(this.data);
		this.left.toList();
		this.right.toList();
		
		return binTreeList;
	}
 
 public boolean correctHeap(int previousRoot) {
	 if(previousRoot >= this.data) {
		 return false;
	 }
	 else {
		 previousRoot = this.data;
		 return (this.left.correctHeap(previousRoot) && this.right.correctHeap(previousRoot));
	 }
	 
 }
 

}
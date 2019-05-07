//an abstract data type (ADT) is a data abstraction where the implementation is hidden behind a set of operations
//The operations are precisely specified independent of any particular implementation

/* ADT Set
 * 	A set is a collection of elements
 * 		- no duplicates
 * 		- no order
 * 
 *  Operations
 *  		- addElt: Set element -> Set
 *  		- removeElt: Set element -> Set
 *  		- hasElt: Set element -> boolean
 *  		- size: Set -> int
 */

interface ISet{
	ISet addElt(int elt);
	ISet removeElt(int elt);
	boolean hasElt(int elt);
	int size();
}

//How to define addElt?
// 	- Option A: add the element to the front of the list
// 	- Option B: check if element is already in the list. If it is, do not add it again. If it isnt, add element to front of list

/* ISet s = new EmptyList();
 * s.addElt(12).addElt(4).addElf(12).addElt(12).addElt(9);
 * 
 * Option A: 9 12 12 4 12
 * Option B: 9 4 12
 */

/* Option A															    Option B
 * --------															    --------
 * add elt to front								    addElt				add to front only if not already there
 * 
 * remove all occurrences						    removeElt			find and remove first occurrence in list
 * 
 * search list, return true at first occurrence	    hasElt				same as (A)
 * return false if element not in set
 * 
 * count unique elements in list					    size					count all elements in list
 * 
 * Amount of time to go through all elements (Big-O worst case)
 * O(1) = same amount of time no matter size of list
 * O(n) = goes through all elements in list
 * 
 * 					Option A					Option B
 * 					---------				--------
 * addElt			   O(1) 					  O(n)
 * removeElt			   O(n)					  O(n)
 * hasElt			   O(n)					  O(n)
 * size			   worse than O(n)			  O(n)
 */
public class ADT {
	
	public ISet addElt(int elt) {

		return null;
	}

	
	

}

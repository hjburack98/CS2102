import java.util.Collections;
import java.util.LinkedList;

public class HeapTester {
	
	HeapTester(){}
	
	public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		LinkedList<Integer> origList = new LinkedList<Integer>();
		LinkedList<Integer> addedList = new LinkedList<Integer>();
		
		origList = hOrig.toList();
		addedList = hAdded.toList();
		
		System.out.println(origList.toString());
		System.out.println(addedList.toString());
		
		Collections.sort(origList);
		Collections.sort(addedList);
		System.out.println(hAdded.correctHeap(Integer.MIN_VALUE));
		
		if(hAdded.correctHeap(Integer.MIN_VALUE) == true) {
			//removes the element from the list made by the added heap
			addedList.removeLastOccurrence(elt);
			
			//if the data part read in the original list is in the added heap's list, take that part out of the added heap's list
			for(int dataPart : origList) {
				if(addedList.contains(dataPart)) {
					addedList.removeLastOccurrence(dataPart);
				}
				else {
					return false;
				}
			}
			
			return (addedList.size() == 0); //returns true only if all parts of the modified list have been removed, signifying the heap is a possible result

		}
		
		else {
			return false;
		}
		
	}
	
	public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
		LinkedList<Integer> origList = new LinkedList<Integer>();
		LinkedList<Integer> removedList = new LinkedList<Integer>();
		int minElt = Integer.MAX_VALUE; //largest possible integer baseline
		
		origList = hOrig.toList();
		removedList = hRemoved.toList();
		
		

		Collections.sort(origList);
		Collections.sort(removedList);
		
		System.out.println(origList.toString());
		System.out.println(removedList.toString());
		System.out.println(hRemoved.correctHeap(Integer.MIN_VALUE));
		
		if(hRemoved.correctHeap(Integer.MIN_VALUE) == true) {
			//finds the minimum element
			for(int dataPart : origList) {
				if(dataPart < minElt) {
					minElt = dataPart;
				}
			}
			
			//removes the minimum element from the list made by the original heap
			origList.removeLastOccurrence(minElt);
			
			//if the data part read in the original list is in the list made by the removed heap, take that part out of the removed heap's list
			for(int dataPart : origList) {
				if(removedList.contains(dataPart)) {
					removedList.removeFirstOccurrence(dataPart);
				}
				else {
					return false;
				}
			}
			
			return (removedList.size() == 0); //returns true only if all parts of the modified list have been removed, signifying the heap is a possible result
			
		}
		
		else {
			return false;
		}
		
	}

}

import java.util.LinkedList;

class WordList {

	LinkedList<String> words; // if you want to use integers the word with a capital I can't use int aka can't
								// be primitive type

	// initialize words to an empty list
	WordList() {
		this.words = new LinkedList<String>();
	}

	// add the given word to this list
	void addWord(String str) {
		this.words.addFirst(str); // this. words is linkedlist
	}

	// compute the number of times the given string appears in the list
	int countUses(String str) {
		int uses = 0;

		/*
		 * for(type var: specific-list){ 
		 * 		statements(s);  this kind you use if you wanna hit every element in the list and not skip over
		 * 	}
		 */

		for (String word : this.words) {
			if (word.equals(str))
				uses = uses + 1; // accumulator style is keeping track of your answer as you go along aka uses
		}
		return uses;
	}
	
	// return a list of the words longer than the given length
	LinkedList<String> wordsLongerThan(int low){
		LinkedList<String> resultList = new LinkedList<String>();
		
		for(String w: this.words) {
			if(w.length() > low)
				resultList.addFirst(w); 
		}
		
		return resultList;
		
	}
	
}











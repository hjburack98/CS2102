
class OldFib {
	OldFib(){}
	
	//will take too long for the computer to run the code recursively
	Long calculateRecursive(int index) {
		if (index == 0) {
			return (long) 0;
		}
		else if(index == 1) {
			return (long) 1;
		}
		else {
			return calculateRecursive(index - 1) + calculateRecursive(index - 2);
		}
	}
	
	
	
}


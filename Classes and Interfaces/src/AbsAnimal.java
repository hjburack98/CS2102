
abstract //if the class is abstract, methods in interface do not need to be included 
class AbsAnimal implements IAnimal { 
	int length;
	
	AbsAnimal(int length){
		this.length = length;
	}
	
	//return true if the length of this animal is between low and high
	boolean isLenWithin(int low, int high) {
		return this.length >= low && this.length <= high;
	}
	
	//is the animal's length less than the given length
	//can put this function in here because both boa and dillo use this function
	public boolean lengthBelow(int someLength) {
		return this.length < someLength;
	}

}

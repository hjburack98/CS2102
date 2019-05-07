
class Dillo extends AbsAnimal implements IAnimal{ //extends goes before implements
			//the dillo's length in inches
	boolean isDead; 		//true if the dillo is dead
	
	Dillo (int length, boolean isDead){
		super(length);
		this.isDead = isDead;

	}
	
	//return true if the dillo is > 60 inches and is dead
	boolean canShelter() {
		return this.length > 60 && this.isDead;
	
	}
	
	//is this dillow's length less than the given length
	public boolean lengthBelow(int someLength) { //MUST be public
		return this.length < someLength;
	}
	
	//is this dillo a normal size?
	public boolean isNormalSize() {
		return isLenWithin(2, 3);
	}

}
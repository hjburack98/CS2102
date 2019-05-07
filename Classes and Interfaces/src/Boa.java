
 class Boa extends AbsAnimal implements IAnimal { //extends comes before implements
	 String name;

	 String eats;
	 
	 Boa(String name, int length, String eats){ 	 //Need to initialize the length in the AbsAnimal constructor
		 super(length); //must call the super class as the first piece, no matter where the variable is in the constructor
		 this.name = name;
		 this.eats = eats;
	 }
	 
	 //Returns true if boas like the same food
	 
	 boolean likesSameFood(Boa otherBoa) {
		 	return this.eats.equals(otherBoa.eats);
		 }
		 
	 //is this boa's length less than the given length
		public boolean lengthBelow(int someLength) { //MUST be public
			return this.length < someLength;
		}
		
		//is this Boa a normal size
		public boolean isNormalSize() {
			return isLenWithin(5,10);
		}
		
		 		 	
	 }


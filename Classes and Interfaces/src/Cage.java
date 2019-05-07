
public class Cage {
	int size;
	IAnimal resident;
	
	Cage (int size, IAnimal resident) {
		this.size = size;
		this.resident = resident;
	}
	//Determine whether the animal will fit in this cage
	boolean checkResidentFits() {
		return this.resident.lengthBelow(this.size);
	}
}

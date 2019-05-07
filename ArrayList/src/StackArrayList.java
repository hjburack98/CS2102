import java.util.ArrayList;
import java.util.NoSuchElementException;

class StackArrayList<T> {
	private ArrayList<T> stack;
	
	public StackArrayList() {
		this.stack = new ArrayList<T>();
	}
	
	//is stack empty
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	
	//add t to the top of this Stack
	public void push(T t) {
		this.stack.add(t);
	}
	
	//remove the top element of this Stack
	T pop() throws NoSuchElementException {
		if(this.isEmpty()) {
			throw new NoSuchElementException("cant pop an empty stack");
		}
		
		else {
			T removeElement = this.stack.remove(this.stack.size() - 1);
			return removeElement;
		}
	}
	
	//peek at the item at the top of this stack
	public T peek() throws NoSuchElementException {
		if(this.isEmpty()) {
			throw new NoSuchElementException("can't pop an empty stack");
		}
		
		else {
			return this.stack.get(this.stack.size() - 1);
			
		}
	}

}

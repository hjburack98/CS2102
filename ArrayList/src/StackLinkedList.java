import java.util.LinkedList;
import java.util.NoSuchElementException;

class Stack <T>{
	private LinkedList<T> stack;
	
	public Stack () {
		this.stack = new LinkedList<T>();
	}
	
	//is the stack empty
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	
	//add t to the top of this Stack
	public void push(T t) {
		this.stack.addFirst(t);
	}
	
	//remove the top element of this Stack
	T pop() throws NoSuchElementException {
		if(this.isEmpty()) {
			throw new NoSuchElementException("can't pop an empty stack");
		}
		else {
			T removeElement = this.stack.removeFirst();
			return removeElement;
		}
	}
	
	//peek at the tiem at the top of this stack
	public T peek() throws NoSuchElementException {
		if(this.isEmpty()) {
			throw new NoSuchElementException("cant pop an empty stack");
		}
		else {
			return this.stack.getFirst();
		}
	}
}

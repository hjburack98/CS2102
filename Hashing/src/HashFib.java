import java.util.HashMap;

public class HashFib {
	private HashMap <Integer, Long> memtab;
	
	 HashFib() {
		this.memtab = new HashMap<Integer, Long>();
	}
	 
	 public Long memomizedFib (Integer index) {
		 if(index == 0) {
			 return (long) 0;
		 }
		 else if(index <= 2) {
			 return (long) 1;
		 }
		 
		 if(memtab.get(index) != null) {
			 return memtab.get(index);
		 }
		 else {
			 long fast = (int) (memomizedFib(index - 1) + memomizedFib(index - 2));
			 memtab.put(index, fast);
			 return fast;
		 }
	 }

}


 class Main {
	 public static void main(String[] args) {
		 
		 HashFib f = new HashFib();
		 OldFib o = new OldFib();
		 System.out.println("Memomized Fib = " + f.memomizedFib(45));
		 System.out.println("Non-memomized Fib = " + o.calculateRecursive(45));
	 }
}

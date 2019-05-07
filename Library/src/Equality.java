
public class Equality {}
	
public class Foo{
		int x;
		int y;
		String s;
		
		Foo(int x, int y, String s){
			this.x = x;
			this.y = y;
			this.s = s;
		}
			
		//is this Foo equal to the given Foo 
		boolean equals(Foo f) {
			return this.x == f.x && this.y == f.y && this.s.equals(f.s);
		}
		
		
	}

	public class example{
		Foo a = new Foo(3,6,s); //object for a
		Foo b = a; // giving another name to refer to object a
		Foo c = new Foo(3,6,s); // creating a new object
		
		if(a.equals(b))... will be true
		
		if(a.equals(c))... 
		will be false if calling "equals" without writing a new method because a and c are not the same object, would want to write an equals method
		will be true with the new equals method
		
	}


}

import java.util.HashMap;

class Student {
	 String name;
	 int socialSecurity; //key value
	 double gpa;
	 
	 Student(String name, int socialSecurity, double gpa){
		 this.name = name;
		 this.socialSecurity = socialSecurity;
		 this.gpa = gpa;
	 }
}
 
 class WPI{
	 HashMap<Integer, Student> students = new HashMap<Integer, Student>();
 }

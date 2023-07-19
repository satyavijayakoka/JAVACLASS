package dayOne;

public class day21inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StudentC koshika = new StudentC("koshika", "koka", 222);
	
	System.out.println(koshika.firstname);
	System.out.println(koshika.lastname);
	System.out.println(koshika.ssn);
	koshika.displayname();
	
	
	TeacherC koshikaK = new TeacherC("koshikaK","kokaK", 222, 25000);
	
	System.out.println(koshikaK.firstname);
	System.out.println(koshikaK.lastname);
	System.out.println(koshikaK.ssn);
	koshikaK.displayname();
	koshikaK.displaysalary();
	
	}

}
class StudentC{
	String firstname;
	String lastname;
	int ssn;
	public StudentC(String fn, String ln, int ss) {
		this.firstname = fn;
		this.lastname = ln;
		this.ssn = ss;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class TeacherC extends StudentC{
	int salary;
	
	// Mandatory to have child constructor as parent is having
	// constructor
	// FirstLine of child constructor should be called to parent 
	//.. constructor
	
	public TeacherC(String fn, String ln, int ss, int sa) {
		super(fn,ln,ss);
		this.salary = sa;
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
}



package dayOne;

public class revision7objectwithconstructor {

	public static void main(String[] args) {
		
	// program 1( object constructor)
		
	Animal2 dog = new Animal2("rambo", 7);
	
	System.out.println(dog.name);
	System.out.println(dog.age);
	
	dog.bark();
	String D = dog.weep();
	System.out.println(D);	
	
	// program 2 (single inheritance)
	
	Teacher2 vijaya = new Teacher2("vijaya", "koka", 38);
	System.out.println(vijaya.firstname);
	System.out.println(vijaya.lastname);
	System.out.println(vijaya.age);
	vijaya.displayname();
	
	Professor2 vijayak = new Professor2("vijayak", "kokak", 38, 12000);
	System.out.println(vijayak.firstname);
	System.out.println(vijayak.lastname);
	System.out.println(vijayak.age);
	System.out.println(vijayak.salary);
	
	vijayak.displayname();
	vijayak.displaysalary();
	
	
	}
}
// program 1 ( object with constructor)

class Animal2{
	String name;
	int age;
	public Animal2(String nm, int ag) {
		this.name = nm;
		this.age = ag;
	}
	public void bark() {
		System.out.println("barking");
	}
	public String weep() {
		return "weeping";		
	}
}
// program 2
// single inheritance

class Teacher2{
	String firstname;
	String lastname;
	int age;
	public Teacher2(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;		
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class Professor2 extends Teacher2{
	int salary;
	public Professor2(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
	
}














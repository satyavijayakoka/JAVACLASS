package dayOne;

public class day25privateandprotected {

	public static void main(String[] args) {

	Animal a = new Animal("lion", "male", 12);
	System.out.println(a.name);
	System.out.println(a.gender);
	// System.out.println(a.age); (private)
		
	// calling method
	
	a.displayname();
	a.displayageandgender();
	//a.displaygender();(private)
	
	// creating an instance(object) of child class
	
	Elephant e = new Elephant("lion", "male", 12, 4);
	System.out.println(e.name);
	System.out.println(e.gender);
	System.out.println(e.legs);
	e.displayname();
	e.displayageandgender();
	
	// overloading
	e.borndate(2020);
	e.borndate(2020, "may");
	e.borndate(202, "may", 11);
	
	// calling out parent method
	e.displaymesg();
	
	int e1 = e.displayears();
	System.out.println(e1);
	}

}


class Animal{
	String name;
	String gender;
	private int age;
	public Animal(String nm, String gn, int ag) {
		this.name = nm;
		this.gender = gn;
		this.age = ag;
	}
	public void displayname() {
		System.out.println(this.name);
	}
	public void displayageandgender() {
		System.out.println(this.age);
		this.displaygender();
	}
	private  void displaygender() {
		System.out.println(this.gender);
	}
	public void displaymesg() {
		System.out.println("animals live in forest");
	}
	protected void displaymesg2() {
		System.out.println("animals live in forest and zoo");
	}
}

class Elephant extends Animal{
	int legs;
	private int ears = 2;
	public Elephant(String nm, String gn, int ag, int lg) {
		super(nm, gn, ag);
		this.legs = lg;
	}
	// overloading ( same class, same method, different signatures)
	public void borndate(int year) {
		System.out.println(year);
	}
	public void borndate(int year, String month) {
		System.out.println(year);
		System.out.println(month);
	}
	public void borndate(int year, String month, int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}
	public int displayears() {
		return this.ears;
	}
	// overriding( different class, same method, same signatures)(inheritance)
	
	public void displaymesg() {
		System.out.println("elephants live in zoo");
		super.displaymesg();
		this.displaymesg2();
		
	}
	
	
	
	
	
	
	
	
}








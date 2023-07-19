package dayOne;

public class day25practice {

	public static void main(String[] args) {
		
		
		VehicleM m = new VehicleM("black", "suv", 123);
		System.out.println(m.color);
		System.out.println(m.model);
		
		// System.out.println(m.chaseno); [private]
		// calling method
		
		m.diplaycolor();
		m.displaychasenoandmodel();
		m.displaygreetmsg();
		
		// m.displaymodel();[private]
		// creating a instance of child class
		
		CarM m1 = new CarM("black", "suv", 456, "audi");
		System.out.println(m1.color);
		System.out.println(m1.model);
		System.out.println(m1.name);
		
		m1.diplaycolor();
		m1.displaychasenoandmodel();
		
		// over loading
		
		m1.launchdate(2011);
		m1.launchdate(2011, "aug");
		m1.launchdate(2011, "aug", 11);
		
		// calling out parent method
		
		m1.displaymesg();
		
		
		int w = m1.displaywheels();
		System.out.println(w);		

	}

}

class VehicleM{
	String color;
	String model;
	private int chaseno;
	public VehicleM(String cl, String md, int cn) {
		this.color = cl;
		this.model = md;
		this.chaseno = cn;
	}
	public void diplaycolor() {
		System.out.println(this.color);
	}
	public void displaychasenoandmodel() {
		System.out.println(this.chaseno);
		this.displaymodel();
	}
	private void displaymodel() {
		System.out.println(this.model);
	}
	public void displaygreetmsg() {
		System.out.println("congrats on new vehicle");
	}
	protected void displaygreetmesg2() {
		System.out.println("congrats on new vehicle mesg2");
	}
}

class CarM extends VehicleM{
	String name;
	private int wheels = 4;
	public CarM(String cl, String md, int cn, String nm) {
		super(cl, md, cn);
		this.name = nm;
	}
	
	// over loading
	// same class, same method name, different signatures
		
		public void launchdate(int year) {
			System.out.println(year);
		}
		public void launchdate(int year, String month) {
			System.out.println(year);
			System.out.println(month);
		}
		public void launchdate(int year, String month, int date) {
			System.out.println(year);
			System.out.println(month);
			System.out.println(date);
		}
		
		public int displaywheels() {
			return this.wheels;
		}
		
	// over riding
		// different class, same method, same signatures (inheritance)
		
		public void displaymesg() {
			System.out.println("congrats on new car");
			super.displaygreetmsg();
			this.displaygreetmesg2();
		}	
	}

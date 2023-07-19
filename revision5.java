package dayOne;

public class revision5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object
		// program1
		Book B1 = new Book();
		
		System.out.println(B1.name);
		System.out.println(B1.pages);
		
		B1.name = "Examwarriors Modi";
		B1.pages= 160;
		
		System.out.println(B1.name);
		System.out.println(B1.pages);
		
		B1.read();
		B1.write();
		
		// program2
		
		Book2 B2 = new Book2();
		System.out.println(B2.fullname);
		System.out.println(B2.pages);
		B2.fullname = "Bharath Vibhajan";
		B2.pages = 240;
		System.out.println(B2.fullname);
		System.out.println(B2.pages);
		
		B2.diplayname();
		
		// program3
		
		Book3 B3 = new Book3("Shakti se shanti",237);
		System.out.println(B3.fullname);
		System.out.println(B3.pages);
		
		B3.displayname();
		
		// program4
		
		Pen P1 = new Pen("Reynolds",152);
		System.out.println(P1.cost);
		System.out.println(P1.fullname);
		
		P1.displayname();
	}

}

class Book{
	int pages;
	String name;
	public void read() {
		System.out.println("read the book");
	}
	public void write() {
		System.out.println("write the book");
	}
}

class Book2 {
	int pages;
	String fullname;
	public void diplayname() {
		System.out.println(this.fullname);
	}
}

class Book3 {
	int pages;
	String fullname;
public Book3(String fn, int pg) {
	this.fullname = fn;
	this.pages = pg;
}
	public void displayname() {
		System.out.println(this.fullname);
	}
	
}

class Pen{
	String fullname;
	int cost;
	public Pen(String fn,int ct) {
		this.fullname = fn;
		this.cost = ct;
	}
	public void displayname() {
		System.out.println(this.fullname);
	}
}


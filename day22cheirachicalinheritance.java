package dayOne;

public class day22cheirachicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonC Madhu = new SonC("Adinarayana","Duggirala","Madhu");
		
		System.out.println(Madhu.firstname);
		System.out.println(Madhu.lastname);
		System.out.println(Madhu.Sname);
		
		Madhu.displayFname();
		Madhu.displaySname();
		
		Daughter Nalini = new Daughter("Adinarayana","Duggirala","Nalini");
		System.out.println(Nalini.firstname);
		System.out.println(Nalini.lastname);
		System.out.println(Nalini.Dname);
		
		Nalini.displayFname();
		Nalini.displayDname();
	}

}

class FatherC {
	String firstname;
	String lastname;
	public FatherC(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	public void displayFname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class SonC extends FatherC{
	String Sname;
	public SonC(String fn, String ln, String Sn) {
		super(fn, ln);
		this.Sname = Sn;
	}
	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}
}
class Daughter extends FatherC{
	String Dname;
	public Daughter(String fn, String ln, String Dn) {
		super(fn, ln);
		this.Dname = Dn;
	}
	public void displayDname() {
		System.out.println(this.Dname + this.lastname);
	}
}


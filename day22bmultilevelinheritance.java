package dayOne;

public class day22bmultilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son madhu = new Son("venkat", "duggirala" , "adinarayana", "madhu");
		System.out.println(madhu.firstname );
		System.out.println(madhu.lastname);
		System.out.println(madhu.Fname);
		System.out.println(madhu.Sname);
		
		madhu.displayname();
		madhu.displayFname();
		madhu.displaySname();
		
	}

}
class GrandFather{
	String firstname;
	String lastname;
	public GrandFather(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
	
}
class Father extends GrandFather{
	String Fname;
	public Father(String fn, String ln, String Fn) {
		super(fn, ln);
		this.Fname = Fn;
	}
	public void displayFname() {
		System.out.println(this.Fname + this.lastname);
	}
}
class Son extends Father{
	String Sname ;
	public Son(String fn, String ln, String Fn, String Sn) {
		super(fn, ln, Fn);
		this.Sname = Sn;
	}
	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}
}
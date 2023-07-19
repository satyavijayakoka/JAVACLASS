package dayOne;

public class day26bpracticeabstractclasswithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	University U = new University("Nagarjuna university");
	
		System.out.println(U.name);
		U.study();
	}

}
abstract class College{
	String name;
	public College(String nm) {
		this.name = nm;
	}
	abstract void study();
	
}
class University extends College{
	public University(String nm) {
		super(nm);
	}
	public void study() {
		System.out.println("i am studying");
	}
}


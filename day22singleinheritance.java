package dayOne;

public class day22singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeacherN sabitha = new TeacherN("sabitha","reddy",35,12000);
		System.out.println(sabitha.firstname);
		System.out.println(sabitha.lastname);
		System.out.println(sabitha.age);
		System.out.println(sabitha.salary);
		sabitha.displayname();
		sabitha.displaysalary();
		
		
		
		
	}

}

class StudentN{
	String firstname;
	String lastname;
	int age;
	public StudentN(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}
class TeacherN extends StudentN{
	int salary;
	public TeacherN(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
}






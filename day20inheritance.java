package dayOne;

public class day20inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StudentB jathin = new StudentB();
	System.out.println(jathin.firstname);
	System.out.println(jathin.lastname);
	System.out.println(jathin.ssn);
	jathin.displayname();	
		
		
TeacherB jathinK = new TeacherB();
System.out.println(jathinK.firstname);
System.out.println(jathinK.lastname);
System.out.println(jathinK.ssn);
jathinK.displayname();
jathinK.displaysalary();

	}

}

class StudentB {
	String firstname = "satya";
	String lastname = "koka";
	int ssn = 4321;
	public void displayname() {
		System.out.println(this.firstname+this.lastname);
	}
}

class TeacherB extends StudentB{
	int salary = 10000;
	public void displaysalary() {
		System.out.println(this.salary);
	}
}
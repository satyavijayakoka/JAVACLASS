package dayOne;

public class day18practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program1
		
	Person[] students = {new Person("sai","sharma",23), new Person("rahul","roy",25), new Person("ram","dev",26),	
		
		             new Person("karim","basha",27), new Person("john","daniel",29)};
	
	// for loop
	
	for(int i = 0; i < students.length; i++) {
		students[i].diplayname();
	}
		
	// while loop
	
		int t1 = 0;
		while(t1 < students.length) {
			students[t1].diplayname();
			t1++;
		}
		
	// for each
	
		for(Person student: students) {
			student.diplayname();
		}
		
		
		// program2
		
		Calculator tim = new Calculator();
		tim.addition(17, 12);
		tim.addition(17, 12, 2);
		tim.addition(17, 12, 2, 4);
		
		
		
	}

}

class Person{
	String firstname;
	String lastname;
	int age;
	public Person(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;
	}
	public void diplayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Calculator{
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void addition(int a, int b, int c,int d) {
		System.out.println(a+b+c+d);
	}
	
	
}














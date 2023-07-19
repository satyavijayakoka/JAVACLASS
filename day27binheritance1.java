package dayOne;
class A{
	public void greetA() {
		System.out.println("hello");
	}
}
class B{
	public void greetB() {
		System.out.println("bye");
	}
}

// only one class can be inherited

class C extends A{
	
}
public class day27binheritance1 {

	public static void main(String[] args) {
	C Apple = new C();
	Apple.greetA();

	}

}



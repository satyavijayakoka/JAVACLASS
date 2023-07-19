package dayOne;

public class day26apractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// you cannot create object for abstract class
		// AnimalH h = new AnimalH();
		
		Tiger T = new Tiger();
		T.displayforest();
		T.displayzoo();
		T.eat();
		T.fight();	

	}

}

abstract class AnimalH{
	abstract void eat();
	abstract void fight();
	public void displayforest() {
		System.out.println("i live in forest");
	}
}

class Lion extends AnimalH{
	public void eat() {
		System.out.println("i eat chicken");
	}
	public void fight() {
		System.out.println("i will fight");
	}
	public void displayzoo() {
		System.out.println("i live in zoo");
	}
}
class Tiger extends AnimalH{
	public void eat() {
		System.out.println("i eat meat");
	}
	public void fight() {
		System.out.println("i will fight");
	}
	
	public void displayzoo() {
		System.out.println("i live in zoo2");
	}
	
	
}

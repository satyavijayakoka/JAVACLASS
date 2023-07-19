package dayOne;

public class day15oopsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating an instance or object
		Human satya = new Human();
		System.out.println(satya.age);
		System.out.println(satya.name);
		satya.talk();
		satya.walk();
		satya.age = 35;
		satya.name = "satya koka";
		System.out.println(satya.age);
		System.out.println(satya.name);
		
		// creating an object
		Human madhu = new Human();
		System.out.println(madhu.age);
		System.out.println(madhu.name);
		madhu.talk();
		madhu.walk();
		madhu.age = 39;
		madhu.name = "madhu duggirala";
		System.out.println(madhu.age);
		System.out.println(madhu.name)	;
			
	}

}
 class Human {
// properties
  int age ;
  String name;
  
// methods
 public void talk() {
	System.out.println("I am talking");
}

 public void walk() {
	System.out.println("I am walking");
}

}








